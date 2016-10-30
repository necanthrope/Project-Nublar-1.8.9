package com.projectnublar.mod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class NonOpaqueBlock extends BasicBlock {
	
	public NonOpaqueBlock(String name, Material material, float hardness, float resistance)
	{
		super(name, material, hardness, resistance);
	}
	
	@Override
	public boolean isFullCube() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT_MIPPED;
	}
	
	@Override
	public boolean isNormalCube() {
		return false;
	}
	
}
