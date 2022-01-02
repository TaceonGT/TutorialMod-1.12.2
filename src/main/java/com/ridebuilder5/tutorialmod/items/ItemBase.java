package com.ridebuilder5.tutorialmod.items;

import com.ridebuilder5.tutorialmod.Main;
import com.ridebuilder5.tutorialmod.init.ModItems;
import com.ridebuilder5.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTORIALMODTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}

