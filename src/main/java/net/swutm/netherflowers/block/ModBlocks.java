package net.swutm.netherflowers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.netherflowers.netherflowers;

public class ModBlocks {

    public static final Block CRIMSON_ORCHID = registerBlock("crimson_orchid",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block CRIMSON_OXEYE_DAISY = registerBlock("crimson_oxeye_daisy",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block CRIMSON_TULIP = registerBlock("crimson_tulip",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block NETHERRACK_TULIP = registerBlock("netherrack_tulip",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block PEACE = registerBlock("peace",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block SOUL_DANDELION = registerBlock("soul_dandelion",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block SOUL_LILY = registerBlock("soul_lily",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block SOUL_TULIP = registerBlock("soul_tulip",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block WARPED_ALLIUM = registerBlock("warped_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block WARPED_CORNFLOWER = registerBlock("warped_cornflower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block WARPED_CRIMSON = registerBlock("warped_crimson",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block WARPED_POPPY = registerBlock("warped_poppy",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    public static final Block WARPED_TULIP = registerBlock("warped_tulip",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.CRIMSON_ROOTS).strength(4.0f).nonOpaque()), ItemGroup.DECORATIONS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(netherflowers.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(netherflowers.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        netherflowers.LOGGER.debug("Registering ModBlocks for " + netherflowers.MOD_ID);
    }
}
