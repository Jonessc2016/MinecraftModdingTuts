package mods.jonessc2016tuts.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="Tut", name="Tut", version="1.5.1 - 1.5.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class jonessc2016tuts {
	
	@Instance("jonessc2016tuts")
	public static jonessc2016tuts Instance;
	
	@SidedProxy(clientSide="mods.jonessc2016tuts.client.clientProxy", serverSide="mods.jonessc2016tuts.common.commonProxy")
	public static commonProxy proxy;
	
	public static Block tutBlock;
	
	@PreInit
	public void pre(FMLPreInitializationEvent event){
		
	}

	@Init
	public void load(FMLInitializationEvent event){
		tutBlock=new BlocktutBlock(1000, Material.rock).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("Tut Block");
		
		GameRegistry.registerBlock(tutBlock, "Tut Block" + tutBlock.getUnlocalizedName2());
		LanguageRegistry.addName(tutBlock, "Tut Block");
	}
	
	@PostInit
	public void post(FMLPostInitializationEvent event){
		
	}
}
