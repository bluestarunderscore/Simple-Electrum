package com.bluestar.simpleelectrum.items;

import com.bluestar.simpleelectrum.SimpleElectrum;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import java.util.EnumMap;
import java.util.function.Supplier;
import java.util.List;
import net.minecraft.registry.Registry;

public class SimpleElectrumArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> SILVER_ARMOR_MATERIAL = registerArmorMaterial("silver",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 4);
                map.put(ArmorItem.Type.HELMET, 2);
            }), 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(SimpleElectrumItems.SILVER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SimpleElectrum.MOD_ID, "silver"))), 0,0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(SimpleElectrum.MOD_ID, name), material.get());
    }
}
