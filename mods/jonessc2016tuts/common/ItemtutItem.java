package mods.jonessc2016tuts.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemtutItem extends Item{	public ItemtutItem(int par1) {		super(par1);	}
	
	@Override
    public void registerIcons(IconRegister reg){
    this.itemIcon = reg.registerIcon("jonessc2016tuts:tutItem");
	}
	}
