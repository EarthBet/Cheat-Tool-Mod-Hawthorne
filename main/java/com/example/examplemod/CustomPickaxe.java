package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {

	public CustomPickaxe() {
		super(ExampleMod.myToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("my_pickaxe");
		this.setUnlocalizedName("my_pickaxe");
		//Replace TOOLS with COMBAT if you're making a weapon or armor instead of a tool.
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
