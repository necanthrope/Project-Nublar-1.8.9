package com.projectnublar.mod.world;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Level;

import com.projectnublar.mod.Reference;

import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.FMLLog;
import scala.actors.threadpool.Arrays;

public class BiomeFossilRegistry {

	public static class BiomeMapping {
		public final Type biomeTag;
		public final int[] worldData;

		public BiomeMapping(Type biomeTag, int... worldData) {
			this.biomeTag = biomeTag;
			this.worldData = worldData;
		}
	}

	public static class FossilMapping {
		public final int fossilMetadata;
		public final int[] worldData;

		public FossilMapping(int fossilMetadata, int... worldData) {
			this.fossilMetadata = fossilMetadata;
			this.worldData = worldData;
		}
	}

	public static final int INDEX_WEIGHT = 0;
	public static final int INDEX_YMIN   = 1;
	public static final int INDEX_YMAX   = 2;

	public static final BiomeFossilRegistry INSTANCE = new BiomeFossilRegistry();

	private final EnumMap<Type, Set<FossilMapping>> registry;

	protected BiomeFossilRegistry() {
		registry = new EnumMap<>(Type.class);
		for(Type t : Type.values())
			registry.put(t, new HashSet<>());
	}

	public void register(int fossilMetadata, BiomeMapping... biomeMappings) {
		for(BiomeMapping biome : biomeMappings)
			registry.get(biome.biomeTag).add(new FossilMapping(fossilMetadata, biome.worldData));
	}

	private Set<FossilMapping> getFossilsFor(Type... biomeTags) {
		return getFossilsFor(-1, biomeTags);
	}

	private Set<FossilMapping> getFossilsFor(int depth, Type... biomeTags) {
		List<Type> bList = Arrays.asList(biomeTags);
		return registry.entrySet().stream()
				.filter(entry -> bList.contains(entry.getKey()))
				.flatMap(entry -> entry.getValue().stream())
				.filter(entry -> depth < 0 ? true : entry.worldData[INDEX_YMIN] <= depth && entry.worldData[INDEX_YMAX] >= depth)
				.collect(Collectors.toSet());
	}

	public int getFossilMetadataFor(Random rand, Type... biomeTags) {
		return getFossilMetadataFor(rand, -1, biomeTags);
	}

	public int getFossilMetadataFor(Random rand, int depth, Type... biomeTags) {
		int sumWeight = 0;
		Set<FossilMapping> fossils = getFossilsFor(depth, biomeTags);

		for(FossilMapping fossil : fossils) {
			sumWeight += fossil.worldData[INDEX_WEIGHT];
		}

		int selected = rand.nextInt(sumWeight);

		for(FossilMapping fossil : fossils) {
			selected -= fossil.worldData[INDEX_WEIGHT];
			if(selected <= 0)
				return fossil.fossilMetadata;
		}

		FMLLog.log(Level.ERROR, "[%s] Error generating random fossil!", Reference.MOD_NAME);
		return 0;
	}
}