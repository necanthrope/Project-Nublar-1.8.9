package com.projectnublar.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item {
	
	public BasicItem(String name)
	{
		super();
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
}
