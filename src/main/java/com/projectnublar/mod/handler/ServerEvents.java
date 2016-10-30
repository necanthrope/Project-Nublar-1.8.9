package com.projectnublar.mod.handler;

import net.minecraftforge.common.MinecraftForge;

public class ServerEvents {
	
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new ServerEvents());
		
	}
}
