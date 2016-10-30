package com.projectnublar.mod.util.commands;

import com.projectnublar.mod.Reference;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class CommandCrash extends CommandBase{

	@Override
	public String getCommandName() {
		return "crash";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/crash";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		System.err.println("=====================================================");
		System.err.println("[" + Reference.MOD_ID +"] USER INITIATED CRASH");
		System.err.println("HARD EXIT, this may caused world corruption!");
		System.err.println("Exiting Minecraft.");
		System.err.println("=====================================================");
		FMLCommonHandler.instance().exitJava(1, true);
	}

}
