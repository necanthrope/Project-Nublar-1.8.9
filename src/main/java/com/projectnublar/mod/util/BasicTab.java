package com.projectnublar.mod.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BasicTab extends CreativeTabs {

	public BasicTab(String label) {
		super(label);
		//this.setBackgroundImageName("ShadowWorld.png");
	}

	@Override
	public Item getTabIconItem() {
	//	if (getTabLabel().equals("tabShadowHunter"))
	//	{
	//		return ShadowItems.lightstone;
	//	} 
	//	else
	//	{
	//		return ShadowRunes.rune_blank;	
	//	}
		return Items.apple;
	}

}
