package net.swutm.netherflowers;

import net.fabricmc.api.ModInitializer;
import net.swutm.netherflowers.block.ModBlocks;
import net.swutm.netherflowers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class netherflowers implements ModInitializer {
	public static final String MOD_ID = "netherflowers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
