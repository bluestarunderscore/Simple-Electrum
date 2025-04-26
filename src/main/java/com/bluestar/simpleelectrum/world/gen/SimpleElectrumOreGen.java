package com.bluestar.simpleelectrum.world.gen;

import com.bluestar.simpleelectrum.world.SimpleElectrumPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class SimpleElectrumOreGen
{
    public static void generateOres()
    {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                SimpleElectrumPlacedFeatures.SILVER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                SimpleElectrumPlacedFeatures.NETHER_SILVER_ORE_PLACED_KEY);

        // Example for individual Biomes (from KaupenJoe tutorials)
        // BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.PLAINS),
        // GenerationStep.Feature.UNDERGROUND_ORES,
        //         ModPlacedFeatures.PINK_GARNET_ORE_PLACED_KEY);

    }
}
