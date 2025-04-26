package com.bluestar.simpleelectrum.datagen;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.items.SimpleElectrumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class SimpleElectrumModelProvider extends FabricModelProvider
{
    public SimpleElectrumModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.NETHER_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(SimpleElectrumBlocks.ELECTRUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(SimpleElectrumItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_BLEND, Models.GENERATED);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(SimpleElectrumItems.SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.SILVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SimpleElectrumItems.ELECTRUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) SimpleElectrumItems.SILVER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) SimpleElectrumItems.SILVER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) SimpleElectrumItems.SILVER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) SimpleElectrumItems.SILVER_BOOTS));

    }
}
