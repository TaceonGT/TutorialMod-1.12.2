package com.ridebuilder5.tutorialmod.tabs;

import com.ridebuilder5.tutorialmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {

	public TutorialTab(String label) {
		super("tutorialmodtab");
		this.setBackgroundImageName("tutorialmod.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY);
	}
}
