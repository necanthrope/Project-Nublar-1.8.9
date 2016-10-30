package com.projectnublar.mod.blocks;

import com.projectnublar.mod.init.NublarItems;

import net.minecraft.block.material.Material;

public class BlockAmberOre extends BasicOre {

	public BlockAmberOre() {
		super("amber_ore", Material.rock, 2, NublarItems.amber, 0, 1, 2);
	}

}
