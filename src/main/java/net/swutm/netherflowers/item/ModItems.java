package net.swutm.netherflowers.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.netherflowers.netherflowers;

public class ModItems {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(netherflowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        netherflowers.LOGGER.info("1" + netherflowers.MOD_ID);
    }
}

