package com.bluestar.simpleelectrum.blocks;

import com.bluestar.simpleelectrum.SimpleElectrum;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SimpleElectrumBlocks
{
    public static final Block SILVER_ORE = register(new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)),
            "silver_ore", true);
    public static final Block DEEPSLATE_SILVER_ORE = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)),
            "deepslate_silver_ore", true);
    public static final Block NETHER_SILVER_ORE = register(new Block(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)),
            "nether_silver_ore", true);
    public static final Block RAW_SILVER_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)),
            "raw_silver_block", true);
    public static final Block SILVER_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)),
            "silver_block", true);
    public static final Block ELECTRUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)),
            "electrum_block", true);

    public static void initialize()
    {
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(SimpleElectrum.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }
}
