package com.projectnublar.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood {
	public BasicFood(String name, int healAmount, float saturationModifier, boolean petMeat)
	{
		super(healAmount, saturationModifier, petMeat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
}
