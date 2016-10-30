package com.projectnublar.mod.init;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.projectnublar.mod.blocks.BlockAmber;
import com.projectnublar.mod.blocks.BlockAmberOre;
import com.projectnublar.mod.blocks.BlockDebug;
import com.projectnublar.mod.blocks.BlockFossilOre;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NublarBlocks {
	
	private static final HashMap<Block, String> blocks = new HashMap<Block, String>();
	
	public static Block debug_block = new BlockDebug();
	public static Block fossil_ore = new BlockFossilOre();
	public static Block amber_ore = new BlockAmberOre();
	public static Block amber_block = new BlockAmber();
	
	public static void create()
	{
		blocks.put(debug_block, "debug_block");
		blocks.put(fossil_ore, "fossil_ore");
		blocks.put(amber_ore, "amber_ore");
		blocks.put(amber_block, "amber_block");
		
	}
	
	public static void register()
	{
		Set<Block> keys = blocks.keySet();
		for(Iterator<Block> i = keys.iterator(); i.hasNext();)
		{
			Block currentBlock = i.next();
			GameRegistry.registerBlock(currentBlock, blocks.get(currentBlock));
		}
		
	}
	
	
	public static void registerBlockRenders()
	{
		Set<Block> keys = blocks.keySet();
		for(Iterator<Block> i = keys.iterator(); i.hasNext();)
		{
			Item currentBlockItem = Item.getItemFromBlock(i.next());
			NublarItems.registerRender(currentBlockItem);
		}
	}
}
