package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CustomSpade extends ItemSpade {

	public CustomSpade() {
		super(ExampleMod.myToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("my_spade");
		this.setUnlocalizedName("my_spade");
		//Replace TOOLS with COMBAT if you're making a weapon or armor instead of a tool.
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
