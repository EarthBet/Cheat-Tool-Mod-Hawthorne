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
//Line 4, Format: import net.minecraft.item.ItemType;
//Line 4: Just change Pickaxe in ItemPickaxe to whatever the item type is.
//This could be Sword, Pickaxe, Spade, Axe, or Hoe.
//Line 6: Change NewPickaxe to whatever you changed the classname to.
//Line 6: Change ItemPickaxe to whatever item type you changed the import statement on line 4 to.
//Line 6, Format: public class ClassName extends ItemType;
//Line 8: Change NewPickaxe() to ClassName()
//Line 8, Format: public ClassName() {
//Line 9: Change myToolMaterial to one of your custom tool materials.
//Line 9, Format: super(ExampleMod.customToolMaterial);
//Line 11: This'll be what your item is named in the files, change this to avoid mod conflict
//Make sure it's recognizable as this item, but not something some other group is likely to pick.
//Line 11, Format: this.setRegistryName("internal_name_in_no_caps");
//Line 12: Same as Line 11
//Line 12, Format:this.setUnloalizedName("internal_name_in_no_caps");
//Lines 11 and 12: These are the names that you'd use for /give when giving yourself this item with commands.
//Line 14: As it says on line 13, just change TOOLS to COMBAT if this is a sword.
//Line 14, Format: this.setCreativeTab(CreativeTabs.CREATIVETAB);
