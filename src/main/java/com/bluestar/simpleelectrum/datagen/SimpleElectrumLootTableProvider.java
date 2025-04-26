package com.bluestar.simpleelectrum.datagen;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.items.SimpleElectrumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SimpleElectrumLootTableProvider extends FabricBlockLootTableProvider
{
    public SimpleElectrumLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);


        addDrop(SimpleElectrumBlocks.SILVER_ORE, oreDrops(SimpleElectrumBlocks.SILVER_ORE, SimpleElectrumItems.RAW_SILVER));
        addDrop(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE, oreDrops(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE, SimpleElectrumItems.RAW_SILVER));
        addDrop(SimpleElectrumBlocks.NETHER_SILVER_ORE, (block) -> this.dropsWithSilkTouch(block, applyExplosionDecay(block, ItemEntry.builder(SimpleElectrumItems.SILVER_NUGGET)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 6.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE))))));

        addDrop(SimpleElectrumBlocks.RAW_SILVER_BLOCK);
        addDrop(SimpleElectrumBlocks.SILVER_BLOCK);
        addDrop(SimpleElectrumBlocks.ELECTRUM_BLOCK);

    }

    public void addSlab(Block block)
    {
        addDrop(block, slabDrops(block));
    }
}