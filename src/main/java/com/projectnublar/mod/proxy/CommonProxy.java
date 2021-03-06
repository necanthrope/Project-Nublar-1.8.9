package com.projectnublar.mod.proxy;

import com.projectnublar.mod.handler.CommonEvents;
import com.projectnublar.mod.init.NublarBlocks;
import com.projectnublar.mod.init.NublarEntities;
import com.projectnublar.mod.init.NublarItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event)
	{
		NublarItems.create();
		NublarBlocks.create();
		
		NublarItems.register();
		NublarBlocks.register();
		
		NublarEntities.create();
	}
	
	public void init(FMLInitializationEvent event)
	{
		CommonEvents.init();
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		//Inter-Mod-Stuff
		//Recipe removing
	}
}
