package com.projectnublar.mod.items;

import java.util.List;

import com.projectnublar.mod.world.BiomeFossilRegistry.BiomeMapping;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BiomeDictionary.Type;;

public class ItemFossil extends BasicItem{

	private static int META_COUNTER = 0;

	protected static class ItemFossilData {
		public final int metadata;
		//TODO: Change to DinoStats later!
		public final Object stats;
		public final BiomeMapping[] biomeMappings;

		public ItemFossilData(int metadata, Object stats, BiomeMapping...biomeMappings) {
			this.metadata = metadata;
			this.stats = stats;
			this.biomeMappings = biomeMappings;
		}
	}

	/**
	 * TODO: Populate with ALL fossil variants!
	 * Fossil data array.
	 *
	 * Biome mapping paramaters are 1: Fossil WEIGHT (Lower = More rare)
	 *  							2: Fossil Y MIN
	 *  							3: Fossil Y MAX
	 */
	public static final ItemFossilData[] FOSSIL_DATA = {
		//Generic Fossil 1
		new ItemFossilData( META_COUNTER++,
			null,
			new BiomeMapping(Type.BEACH, 5, 1, 60),
			new BiomeMapping(Type.FOREST, 5, 1, 60)
		),
		//Generic Fossil 2
		new ItemFossilData( META_COUNTER++,
			null,
			new BiomeMapping(Type.FOREST, 5, 1, 10),
			new BiomeMapping(Type.FOREST, 1, 11, 30)
		)
	};

	public ItemFossil() {
		super("fossil");
		this.setHasSubtypes(true);
	}

	/**
	 * Appends the metadata of the stack to the unlocalized name.
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return String.format("%s_%d", this.getUnlocalizedName(), stack.getMetadata());
	}

	/**
	 * Creates the subitems using the {@link=FOSSIL_DATA} array
	 */
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
			for(ItemFossilData data : FOSSIL_DATA) {
				subItems.add(new ItemStack(itemIn, 1, data.metadata));
			}
	}
}
