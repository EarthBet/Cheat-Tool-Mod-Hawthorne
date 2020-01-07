package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
	//The following lines are the mod's name. MODID has to be in lowercase and has to do with file names, you probably shouldn't bother changing it, but if you want to an explanation of what you need to change will be at the bottom of the page.
	//NAME is what the mod will be called in Minecraft.
    public static final String MODID = "toolkit";
    public static final String NAME = "Cheat Tools Mod";
    public static final String VERSION = "1.2";

    private static Logger logger;
    
    // New Variables
    //Warning: Axes don't seem to be made the same way as swords, pickaxes, and shovels. If you try to make one the same way, it'll probably fail, though it's possible it was just an error on my part and it'll work fine.
    // Any time in the future you see myToolMaterial, mySword, myPickaxe, mySpade, or whatever replace them with whatever you have in the following lines.
    public static ToolMaterial myToolMaterial;
    public static Item mySword;
    public static Item myPickaxe;
    //The import statement for shovels calls them spades instead
    public static Item mySpade;
    //For example, if you replace the above line with the one below, replace every mySpade with myHoe.
    //public static Item myHoe;
    
    public static ToolMaterial thatToolMaterial;
    public static Item thatSword;
    public static Item thatPickaxe;
    public static Item thatSpade;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        //myToolMaterial = EnumHelper.addToolMaterial("MATERIAL NAME", harvestLevel, maxUses, efficiency, damage, enchantability);
        // "MATERIAL NAME" - Replaced MATERIAL NAME with what you want the item to be named.
        // harvestLevel - What a tool made out this material can mine without losing the drops. Goes from 1 to 4, 1 being equivalent to a wood tool, 2 being equivalent to a stone tool, 3 being equivalent to an iron tool, and 4 being equivalent to a diamond tool
        // maxUses - Durability of a tool or weapon made out of this material. 
        // efficiency - How effective a tool made of this material will be against blocks below or including its harvest level.
        // damage - How much damage a weapon made of this material will do against mobs
        // enchantability - The enchantability of tools or weapons made of this material
        // If a number is a float, don't make it not a float! Don't forget the F at the end!
        myToolMaterial = EnumHelper.addToolMaterial("Notch Apple", 4, 288, 50.0F, 50.0F, 30);
        thatToolMaterial = EnumHelper.addToolMaterial("Excalibur", 4, 2048, 100.0f, 100.0f, 60);
        
        mySword = new CustomSword();
        myPickaxe = new CustomPickaxe();
        mySpade = new CustomSpade();
        thatSword = new NewSword();
        thatPickaxe = new NewPickaxe();
        thatSpade = new NewSpade();
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
//Go into src/main/resources/assets and then rename toolkit to whatever you changed MODID to.