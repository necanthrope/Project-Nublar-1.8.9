package com.projectnublar.mod.crafting;

import com.projectnublar.mod.init.NublarBlocks;
import com.projectnublar.mod.init.NublarItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShapedCrafting {

	public static void init()
	{
		//Amber Block (cannot be crafted back!)
		GameRegistry.addRecipe(new ItemStack(NublarBlocks.amber_block, 8), "AA", "AA", 'A', NublarItems.amber);
	}
	
}
