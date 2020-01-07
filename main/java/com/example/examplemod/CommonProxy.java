//Do not edit anything above line 22
package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

//Format for the following code chunk
//Note: Do not edit anything before { or after }
//registerRender(ExampleMod.itemName);
//DO NOT CHANGE ANYTHING OTHER THAN THIS!
//Just change the itemNames to your itemNames.
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(ExampleMod.mySword);
		registerRender(ExampleMod.myPickaxe);
		registerRender(ExampleMod.mySpade);
		registerRender(ExampleMod.thatSword);
		registerRender(ExampleMod.thatPickaxe);
		registerRender(ExampleMod.thatSpade);
	}
	//Do not edit this code chunk
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
//Format for the following code chunk
//Note: Do not edit anything before { or after }
//event.getRegistry().registerAll(ExampleMod.itemName);
//DO NOT CHANGE ANYTHING OTHER THAN THIS!
//Just change the itemNames to your itemNames.
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ExampleMod.mySword);
		event.getRegistry().registerAll(ExampleMod.myPickaxe);
		event.getRegistry().registerAll(ExampleMod.mySpade);
		event.getRegistry().registerAll(ExampleMod.thatSword);
		event.getRegistry().registerAll(ExampleMod.thatPickaxe);
		event.getRegistry().registerAll(ExampleMod.thatSpade);
	}
}
