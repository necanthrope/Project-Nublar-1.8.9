package com.projectnublar.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {
	
	public BasicBlock(String name, Material material, float hardness, float resistance)
	{
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeWood);
	}
	
	public BasicBlock(String name, float hardness, float resistance)
	{
		this(name, Material.rock, hardness, resistance);
	}
	
	public BasicBlock(String name)
	{
		this(name, 2.0f, 10.0f);
	}
}
