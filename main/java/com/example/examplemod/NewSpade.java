package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class NewSpade extends ItemSpade {

	public NewSpade() {
		super(ExampleMod.thatToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("that_spade");
		this.setUnlocalizedName("that_spade");
		//Replace TOOLS with COMBAT if you're making a weapon or armor instead of a tool.
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
