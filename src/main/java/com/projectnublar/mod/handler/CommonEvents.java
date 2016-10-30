package com.projectnublar.mod.handler;

import net.minecraftforge.common.MinecraftForge;

public class CommonEvents {
	
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new CommonEvents());
		
	}

}
