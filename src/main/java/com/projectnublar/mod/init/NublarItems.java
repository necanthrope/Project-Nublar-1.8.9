package com.projectnublar.mod.init;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.projectnublar.mod.items.ItemDebug;
import com.projectnublar.mod.items.ItemFragGrenade;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NublarItems {
	
	private static final HashMap<Item, String> items = new HashMap<Item, String>();
	
	public static Item frag_grenade = new ItemFragGrenade();
	public static Item debug_item = new ItemDebug();
	
	public static void init()
	{
		items.put(frag_grenade, "frag_grenade");
		items.put(debug_item, "debug_item");
	}
	
	public static void register()
	{
		Set<Item> keys = items.keySet();
		for(Iterator<Item> i = keys.iterator(); i.hasNext();)
		{
			Item currentItem = i.next();
			GameRegistry.registerItem(currentItem, items.get(currentItem));
		}
	}
	
	public static void registerItemRenders()
	{
		Set<Item> keys = items.keySet();
		for(Iterator<Item> i = keys.iterator(); i.hasNext();)
		{
			Item currentItem = i.next();
			registerRender(currentItem);
		}
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
