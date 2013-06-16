package mods.jonessc2016tuts.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	public static Item tutItem;
	public static Block tutOre;
	
	@PreInit
	public void pre(FMLPreInitializationEvent event){
		
	}

	@Init
	public void load(FMLInitializationEvent event){
		tutBlock=new BlocktutBlock(1000, Material.rock).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("Tut Block");
		tutItem =new ItemtutItem(10000).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("Tut Item");
		tutOre=new BlocktutOre(1001, Material.rock).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("Tut Ore");
		
		GameRegistry.registerBlock(tutBlock, "Tut Block" + tutBlock.getUnlocalizedName2());
		GameRegistry.registerBlock(tutOre, "Tut Ore" + tutOre.getUnlocalizedName2());
		LanguageRegistry.addName(tutBlock, "Tut Block");
		LanguageRegistry.addName(tutItem, "Tut Item");
		LanguageRegistry.addName(tutOre, "Tut Ore");
		
		GameRegistry.registerWorldGenerator(new WorldGenTut());
		
		GameRegistry.addSmelting(1001, (new ItemStack(tutItem, 1)), 100);
		GameRegistry.addShapedRecipe(new ItemStack(tutBlock, 1), "***", "***", "***", '*', tutItem);
	}
	
	@PostInit
	public void post(FMLPostInitializationEvent event){
		
	}
}