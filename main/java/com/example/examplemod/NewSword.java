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
//Line 4, Format: import net.minecraft.item.ItemType;
//Line 4: Just change Sword in ItemSword to whatever the item type is.
//This could be Sword, Pickaxe, Spade, Axe, or Hoe.
//Line 6: Change NewSword to whatever you changed the classname to.
//Line 6: Change ItemSword to whatever item type you changed the import statement on line 4 to.
//Line 6, Format: public class ClassName extends ItemType;
//Line 8: Change NewSword() to ClassName()
//Line 8, Format: public ClassName() {
//Line 9: Change thatToolMaterial to one of your custom tool materials.
//Line 9, Format: super(ExampleMod.customToolMaterial);
//Line 11: This'll be what your item is named in the files, change this to avoid mod conflict
//Make sure it's recognizable as this item, but not something some other group is likely to pick.
//Line 11, Format: this.setRegistryName("internal_name_in_no_caps");
//Line 12: Same as Line 11
//Line 12, Format:this.setUnloalizedName("internal_name_in_no_caps");
//Lines 11 and 12: These are the names that you'd use for /give when giving yourself this item with commands.
//Line 14: As it says on line 13, just change COMBAT to TOOLS if this is a sword.
//Line 14, Format: this.setCreativeTab(CreativeTabs.CREATIVETAB);
