package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class NewPickaxe extends ItemPickaxe {

	public NewPickaxe() {
		super(ExampleMod.thatToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("that_pickaxe");
		this.setUnlocalizedName("that_pickaxe");
		//Replace TOOLS with COMBAT if you're making a weapon or armor instead of a tool.
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
