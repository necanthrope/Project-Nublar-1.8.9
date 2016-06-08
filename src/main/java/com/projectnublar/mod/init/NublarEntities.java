package com.projectnublar.mod.init;

import com.projectnublar.mod.Main;
import com.projectnublar.mod.entity.EntityFragGrenade;
import com.projectnublar.mod.render.RenderGrenade;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class NublarEntities {

	public static void init()
	{
		//EntityRegistry.registerGlobalEntityID(EntityThrownSword.class, "EntitySword", 555);
		EntityRegistry.registerModEntity(EntityFragGrenade.class, "EntityGrenade", 555, Main.instance, 128, 15, true);
	}
	
	@SuppressWarnings("deprecation")
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFragGrenade.class, new RenderGrenade(Item.getItemFromBlock(Blocks.tnt)));
	}
}
