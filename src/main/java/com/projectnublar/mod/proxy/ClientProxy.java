package com.projectnublar.mod.proxy;

import com.projectnublar.mod.handler.ClientEvents;
import com.projectnublar.mod.init.NublarEntities;
import com.projectnublar.mod.init.NublarItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		NublarEntities.registerEntityRenders();
		NublarItems.registerItemRenders();
		
		ClientEvents.init();
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
	
	
}
