package net.dutch.valhalla;

import net.dutch.valhalla.block.ModBlocks;
import net.dutch.valhalla.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Valhalla implements ModInitializer {
	public static final String MOD_ID = "valhalla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}