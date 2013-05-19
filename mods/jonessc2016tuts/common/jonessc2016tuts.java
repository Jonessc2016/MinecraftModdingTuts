package mods.jonessc2016tuts.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="Tut", name="Tut", version="1.5.1 - 1.5.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class jonessc2016tuts {
	
	@Instance("jonessc2016tuts")
	public static jonessc2016tuts Instance;
	
	@SidedProxy(clientSide="mods.jonessc2016tuts.client.clientProxy", serverSide="mods.jonessc2016tuts.common.commonProxy")
	public static commonProxy proxy;
	
	public void pre(FMLPreInitializationEvent event){
		
	}

	
	public void load(FMLInitializationEvent event){
		
	}
	
	public void post(FMLPostInitializationEvent event){
		
	}
}
