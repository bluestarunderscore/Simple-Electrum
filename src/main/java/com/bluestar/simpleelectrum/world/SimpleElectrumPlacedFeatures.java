package com.bluestar.simpleelectrum.world;

import com.bluestar.simpleelectrum.SimpleElectrum;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class SimpleElectrumPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_BURIED_PLACED_KEY = registerKey("silver_ore_buried_placed");
    public static final RegistryKey<PlacedFeature> NETHER_SILVER_ORE_PLACED_KEY = registerKey("nether_silver_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SimpleElectrumConfiguredFeatures.SILVER_ORE_KEY),
                modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, SILVER_ORE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(SimpleElectrumConfiguredFeatures.SILVER_ORE_BURIED_KEY),
                modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-64), YOffset.fixed(-48))));

        register(context, NETHER_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SimpleElectrumConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.belowTop(10))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(SimpleElectrum.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
}
