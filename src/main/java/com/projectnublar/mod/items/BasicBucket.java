package com.projectnublar.mod.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class BasicBucket extends ItemBucket{

	public BasicBucket(Block containedBlock) {
		super(containedBlock);
		this.setUnlocalizedName("bucket_" + containedBlock.getUnlocalizedName().substring(11));
		this.setRegistryName("bucket_" + containedBlock.getUnlocalizedName().substring(11));
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setContainerItem(Items.bucket);
	}

	
}
