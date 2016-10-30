package com.projectnublar.mod.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BasicOre extends BasicBlock {
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public BasicOre(String name, Material material, int harvestlevel, Item drop, int meta, int least_quantity, int most_quantity)
	{
		super(name, material, 3.5f, 15.0f);
		this.setHarvestLevel("pickaxe", harvestlevel);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
	}
	
	public BasicOre(String unlocalizedName, Material material, int harvestlevel, Item drop, int least_quantity, int most_quantity) {
	    this(unlocalizedName, material, harvestlevel, drop, 0, least_quantity, most_quantity);
	}

	public BasicOre(String unlocalizedName, Material material, int harvestlevel, Item drop) {
	    this(unlocalizedName, material, harvestlevel, drop, 1, 1);
	}
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune)
	{
		return this.drop;
	}
	
	@Override
	public int damageDropped(IBlockState blockstate)
	{
		return this.meta;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random)
	{
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
}
