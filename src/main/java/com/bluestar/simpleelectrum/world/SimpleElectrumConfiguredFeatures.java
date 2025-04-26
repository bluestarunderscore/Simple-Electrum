package com.bluestar.simpleelectrum.world;

import com.bluestar.simpleelectrum.SimpleElectrum;
import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class SimpleElectrumConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_BURIED_KEY = registerKey("silver_ore_buried");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrack = new BlockMatchRuleTest(Blocks.NETHERRACK);

        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, SimpleElectrumBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherSilverOres =
                List.of(OreFeatureConfig.createTarget(netherrack,SimpleElectrumBlocks.NETHER_SILVER_ORE.getDefaultState()));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9));
        register(context, SILVER_ORE_BURIED_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9, 0.5F));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherSilverOres, 10));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(SimpleElectrum.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
