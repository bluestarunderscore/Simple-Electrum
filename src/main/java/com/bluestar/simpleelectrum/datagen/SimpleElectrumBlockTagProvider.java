package com.bluestar.simpleelectrum.datagen;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleElectrumBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    private static final Identifier NETHERITE_MINING_LEVEL = Identifier.of("needs_netherite_tool");

    public SimpleElectrumBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(SimpleElectrumBlocks.SILVER_ORE)
                .add(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE)
                .add(SimpleElectrumBlocks.NETHER_SILVER_ORE)
                .add(SimpleElectrumBlocks.RAW_SILVER_BLOCK)
                .add(SimpleElectrumBlocks.SILVER_BLOCK)
                .add(SimpleElectrumBlocks.ELECTRUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(SimpleElectrumBlocks.SILVER_ORE)
                .add(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE)
                .add(SimpleElectrumBlocks.NETHER_SILVER_ORE)
                .add(SimpleElectrumBlocks.RAW_SILVER_BLOCK)
                .add(SimpleElectrumBlocks.SILVER_BLOCK)
                .add(SimpleElectrumBlocks.ELECTRUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(SimpleElectrumBlocks.SILVER_BLOCK)
                .add(SimpleElectrumBlocks.ELECTRUM_BLOCK);
    }
}
