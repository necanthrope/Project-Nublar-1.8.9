package com.projectnublar.mod.blocks;

import com.projectnublar.mod.init.NublarItems;

import net.minecraft.block.material.Material;

public class BlockFossilOre extends BasicOre {

	public BlockFossilOre() {
		super("fossil_ore", Material.rock, 2, NublarItems.fossil, 0, 0, 1);
	}

}
