package com.projectnublar.mod.handler;

import net.minecraftforge.common.MinecraftForge;

public class ClientEvents {
	
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new ClientEvents());
		
	}

}
