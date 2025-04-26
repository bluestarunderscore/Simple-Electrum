package com.bluestar.simpleelectrum;

import com.bluestar.simpleelectrum.datagen.*;
import com.bluestar.simpleelectrum.world.SimpleElectrumConfiguredFeatures;
import com.bluestar.simpleelectrum.world.SimpleElectrumPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class SimpleElectrumDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(SimpleElectrumBlockTagProvider::new);
        pack.addProvider(SimpleElectrumItemTagProvider::new);
        pack.addProvider(SimpleElectrumLootTableProvider::new);
        pack.addProvider(SimpleElectrumModelProvider::new);
        pack.addProvider(SimpleElectrumRecipeProvider::new);
        pack.addProvider(SimpleElectrumRegistryDataGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder)
    {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, SimpleElectrumConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, SimpleElectrumPlacedFeatures::bootstrap);

    }
}
