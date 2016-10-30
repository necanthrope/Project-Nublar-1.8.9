package com.projectnublar.mod.items;

import java.util.List;

import com.projectnublar.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemDebug extends BasicItem {

	public ItemDebug() {
		super("debug");
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("Debug Item");
		tooltip.add(EnumChatFormatting.GRAY + "UNSTABLE");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}	
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		System.out.println("[" + Reference.MOD_ID + "] Debug Item used by " + playerIn.getDisplayNameString() + ", UUID: " + EntityPlayer.getUUID(playerIn.getGameProfile()));
		return super.onItemRightClick(itemStackIn, worldIn, playerIn);
	}
	
	
	
}
