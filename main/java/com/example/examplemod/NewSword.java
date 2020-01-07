package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class NewSword extends ItemSword {

	public NewSword() {
		super(ExampleMod.thatToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("that_sword");
		this.setUnlocalizedName("that_sword");
		//Replace COMBAT with TOOLS if you're making a tool instead of a weapon or armor.
		this.setCreativeTab(CreativeTabs.COMBAT);
		
	}
	

}
