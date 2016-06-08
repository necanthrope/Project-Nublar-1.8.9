package com.projectnublar.mod.init;

import com.projectnublar.mod.blocks.BlockDebug;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NublarBlocks {
	
	static Block debug_block = new BlockDebug();
	
	public static void init()
	{
		GameRegistry.registerBlock(debug_block = new BlockDebug(), "debug_block");
	}
	
	
	
}
