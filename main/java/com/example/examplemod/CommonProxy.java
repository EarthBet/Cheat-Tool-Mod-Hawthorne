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

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(ExampleMod.mySword);
		registerRender(ExampleMod.myPickaxe);
		registerRender(ExampleMod.mySpade);
		registerRender(ExampleMod.thatSword);
		registerRender(ExampleMod.thatPickaxe);
		registerRender(ExampleMod.thatSpade);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
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
