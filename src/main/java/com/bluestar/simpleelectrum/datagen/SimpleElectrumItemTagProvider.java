package com.bluestar.simpleelectrum.datagen;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.items.SimpleElectrumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class SimpleElectrumItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public static final TagKey<Item> COMMON_ARMORS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "armors"));
    public static final TagKey<Item> COMMON_SILVER_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots/silver"));
    public static final TagKey<Item> COMMON_ELECTRUM_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots/electrum"));
    public static final TagKey<Item> COMMON_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots"));
    public static final TagKey<Item> COMMON_NUGGETS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "nuggets"));
    public static final TagKey<Item> COMMON_RAW_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "raw_materials"));

    public static final TagKey<Item> COMMON_ORES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ores"));
    public static final TagKey<Item> COMMON_D_ORES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ores_in_ground/deepslate"));

    public static final TagKey<Item> COMMON_STORAGE = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "storage_blocks"));
    public static final TagKey<Item> COMMON_RAW_BLOCKS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "raw_blocks"));

    public SimpleElectrumItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(SimpleElectrumItems.SILVER_INGOT)
                .add(SimpleElectrumItems.ELECTRUM_INGOT);

        getOrCreateTagBuilder(COMMON_INGOTS)
                .add(SimpleElectrumItems.SILVER_INGOT)
                .add(SimpleElectrumItems.ELECTRUM_INGOT);

        getOrCreateTagBuilder(COMMON_RAW_MATERIALS)
                .add(SimpleElectrumItems.RAW_SILVER)
                .add(SimpleElectrumItems.ELECTRUM_BLEND);

        getOrCreateTagBuilder(COMMON_SILVER_INGOTS)
                .add(SimpleElectrumItems.SILVER_INGOT);

        getOrCreateTagBuilder(COMMON_ELECTRUM_INGOTS)
                .add(SimpleElectrumItems.ELECTRUM_INGOT);

        getOrCreateTagBuilder(COMMON_NUGGETS)
                .add(SimpleElectrumItems.SILVER_NUGGET)
                .add(SimpleElectrumItems.ELECTRUM_NUGGET);

        getOrCreateTagBuilder(COMMON_RAW_BLOCKS)
                .add(SimpleElectrumBlocks.RAW_SILVER_BLOCK.asItem());


        getOrCreateTagBuilder(COMMON_STORAGE)
                .add(SimpleElectrumBlocks.RAW_SILVER_BLOCK.asItem())
                .add(SimpleElectrumBlocks.SILVER_BLOCK.asItem())
                .add(SimpleElectrumBlocks.ELECTRUM_BLOCK.asItem());;

        getOrCreateTagBuilder(COMMON_D_ORES)
                .add(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE.asItem());

        getOrCreateTagBuilder(COMMON_ORES)
                .add(SimpleElectrumBlocks.SILVER_ORE.asItem());

        getOrCreateTagBuilder(COMMON_ARMORS)
                .add(SimpleElectrumItems.SILVER_HELMET)
                .add(SimpleElectrumItems.SILVER_CHESTPLATE)
                .add(SimpleElectrumItems.SILVER_LEGGINGS)
                .add(SimpleElectrumItems.SILVER_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(SimpleElectrumItems.SILVER_HELMET)
                .add(SimpleElectrumItems.SILVER_CHESTPLATE)
                .add(SimpleElectrumItems.SILVER_LEGGINGS)
                .add(SimpleElectrumItems.SILVER_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(SimpleElectrumItems.SILVER_HELMET);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(SimpleElectrumItems.SILVER_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(SimpleElectrumItems.SILVER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(SimpleElectrumItems.SILVER_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(SimpleElectrumItems.SILVER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(SimpleElectrumItems.SILVER_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(SimpleElectrumItems.SILVER_BOOTS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(SimpleElectrumItems.SILVER_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(SimpleElectrumItems.SILVER_SWORD)
                .add(SimpleElectrumItems.ELECTRUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(SimpleElectrumItems.SILVER_PICKAXE)
                .add(SimpleElectrumItems.ELECTRUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(SimpleElectrumItems.SILVER_AXE)
                .add(SimpleElectrumItems.ELECTRUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(SimpleElectrumItems.SILVER_SHOVEL)
                .add(SimpleElectrumItems.ELECTRUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(SimpleElectrumItems.SILVER_HOE)
                .add(SimpleElectrumItems.ELECTRUM_HOE);

    }

}
