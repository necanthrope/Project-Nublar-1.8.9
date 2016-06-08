package com.projectnublar.mod.util;

import com.projectnublar.mod.Main;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityCreator {
	
	@SuppressWarnings("deprecation")
	public static final void createEntity(Class<? extends Entity> entityClass, Render<?> render, String entityName, EnumCreatureType creature, int spawnChance, int minSpawn, int maxSpawn, BiomeGenBase[] biomes, int primaryColor, int secondaryColor)
	{
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.addSpawn(entityName, spawnChance, minSpawn, maxSpawn, creature, biomes);
		EntityRegistry.registerModEntity(entityClass, entityName, id, Main.instance, 32, 7, true, primaryColor, secondaryColor);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
	}
}
