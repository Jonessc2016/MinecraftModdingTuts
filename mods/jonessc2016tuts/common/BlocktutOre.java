package mods.jonessc2016tuts.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlocktutOre extends Block{

	public BlocktutOre(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	@Override
	public void registerIcons(IconRegister reg){
        this.blockIcon = reg.registerIcon("jonessc2016tuts:tutOre");
    }
	
	public int idDropped(int par1, Random rand, int par2) {
        return jonessc2016tuts.tutOre.blockID;
	}
	

}