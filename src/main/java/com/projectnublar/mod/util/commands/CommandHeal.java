package com.projectnublar.mod.util.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandHeal extends CommandBase{

	@Override
	public String getCommandName() {
		return "heal";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/heal";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) sender;
			if(player.getHealth() != player.getMaxHealth())
			{
				player.setHealth(player.getMaxHealth());
			}
			player.getFoodStats().setFoodSaturationLevel(20.0f);
			player.getFoodStats().setFoodLevel(20);
			
		}
		else
		{
			sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "ONLY AVAILABLE TO PLAYERS!"));
		}
	}

}
