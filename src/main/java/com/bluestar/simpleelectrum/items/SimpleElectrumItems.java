package com.bluestar.simpleelectrum.items;

import com.bluestar.simpleelectrum.SimpleElectrum;
import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.datagen.SimpleElectrumRecipeProvider;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SimpleElectrumItems
{
    //SILVER TOOL DURABILITY: 320
    //ARMOR: 280 320 310 300
    public static final Item RAW_SILVER = register(new Item(new Item.Settings()),
            "raw_silver");

    public static final Item SILVER_INGOT = register(new Item(new Item.Settings()),
            "silver_ingot");

    public static final Item SILVER_NUGGET = register(new Item(new Item.Settings()),
            "silver_nugget");

    public static final Item ELECTRUM_BLEND = register(new Item(new Item.Settings()),
            "electrum_blend");

    public static final Item ELECTRUM_INGOT = register(new Item(new Item.Settings()),
            "electrum_ingot");

    public static final Item ELECTRUM_NUGGET = register(new Item(new Item.Settings()),
            "electrum_nugget");

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(SimpleElectrumToolMaterials.SILVER, 0, -2.4f))));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(SimpleElectrumToolMaterials.SILVER, -2, -2.8f))));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(SimpleElectrumToolMaterials.SILVER, -1.5f, -3.0f))));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(SimpleElectrumToolMaterials.SILVER, 3, -3.1f))));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(SimpleElectrumToolMaterials.SILVER, -3, 0f))));

    public static final Item ELECTRUM_SWORD = registerItem("electrum_sword",
            new SwordItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(SimpleElectrumToolMaterials.ELECTRUM, 0, -2.4f))));
    public static final Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe",
            new PickaxeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(SimpleElectrumToolMaterials.ELECTRUM, -2, -2.8f))));
    public static final Item ELECTRUM_SHOVEL = registerItem("electrum_shovel",
            new ShovelItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(SimpleElectrumToolMaterials.ELECTRUM, -1.5f, -3.0f))));
    public static final Item ELECTRUM_AXE = registerItem("electrum_axe",
            new AxeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(SimpleElectrumToolMaterials.ELECTRUM, 3, -3.0f))));
    public static final Item ELECTRUM_HOE = registerItem("electrum_hoe",
            new HoeItem(SimpleElectrumToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(SimpleElectrumToolMaterials.ELECTRUM, -3, 0f))));

    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new ArmorItem(SimpleElectrumArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(26))));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(SimpleElectrumArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(SimpleElectrumArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(21))));
    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(SimpleElectrumArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(23))));

    public static void initialize()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(RAW_SILVER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ELECTRUM_BLEND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(SILVER_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ELECTRUM_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(SILVER_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ELECTRUM_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.SILVER_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.ELECTRUM_BLOCK.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.SILVER_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.NETHER_SILVER_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumBlocks.RAW_SILVER_BLOCK.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_HOE));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_HOE));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.ELECTRUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(SimpleElectrumItems.SILVER_BOOTS));

    }

    public static Item register(Item item, String id)
    {
        Identifier itemID = Identifier.of(SimpleElectrum.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimpleElectrum.MOD_ID, name), item);
    }
}
