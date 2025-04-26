package com.bluestar.simpleelectrum.datagen;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.items.SimpleElectrumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SimpleElectrumRecipeProvider extends FabricRecipeProvider
{
    public SimpleElectrumRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        offerSmelting(recipeExporter, List.of(SimpleElectrumItems.RAW_SILVER), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerSmelting(recipeExporter, List.of(SimpleElectrumBlocks.SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerSmelting(recipeExporter, List.of(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerSmelting(recipeExporter, List.of(SimpleElectrumBlocks.NETHER_SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerSmelting(recipeExporter, List.of(SimpleElectrumItems.ELECTRUM_BLEND), RecipeCategory.MISC, SimpleElectrumItems.ELECTRUM_INGOT, 1.0f, 200, "electrum_ingot");

        offerBlasting(recipeExporter, List.of(SimpleElectrumItems.RAW_SILVER), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerBlasting(recipeExporter, List.of(SimpleElectrumBlocks.SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerBlasting(recipeExporter, List.of(SimpleElectrumBlocks.DEEPSLATE_SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerBlasting(recipeExporter, List.of(SimpleElectrumBlocks.NETHER_SILVER_ORE.asItem()), RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT, 1.0f, 200, "silver_ingot");
        offerBlasting(recipeExporter, List.of(SimpleElectrumItems.ELECTRUM_BLEND), RecipeCategory.MISC, SimpleElectrumItems.ELECTRUM_INGOT, 1.0f, 200, "electrum_ingot");


        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, SimpleElectrumItems.RAW_SILVER, RecipeCategory.BUILDING_BLOCKS, SimpleElectrumBlocks.RAW_SILVER_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, SimpleElectrumItems.SILVER_NUGGET, RecipeCategory.MISC, SimpleElectrumItems.SILVER_INGOT);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, SimpleElectrumItems.ELECTRUM_NUGGET, RecipeCategory.MISC, SimpleElectrumItems.ELECTRUM_INGOT);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, SimpleElectrumItems.ELECTRUM_BLEND, 2)
                .input(Items.RAW_GOLD)
                .input(Items.RAW_GOLD)
                .input(SimpleElectrumItems.RAW_SILVER)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "electrum_blend");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.SILVER_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_sword");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.SILVER_PICKAXE)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_pickaxe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.SILVER_AXE)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_axe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.SILVER_SHOVEL)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_shovel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.SILVER_HOE)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_hoe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.ELECTRUM_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', SimpleElectrumItems.ELECTRUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.ELECTRUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.ELECTRUM_INGOT)))
                .offerTo(recipeExporter, "electrum_sword");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.ELECTRUM_PICKAXE)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.ELECTRUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.ELECTRUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.ELECTRUM_INGOT)))
                .offerTo(recipeExporter, "electrum_pickaxe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.ELECTRUM_AXE)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.ELECTRUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.ELECTRUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.ELECTRUM_INGOT)))
                .offerTo(recipeExporter, "electrum_axe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.ELECTRUM_SHOVEL)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', SimpleElectrumItems.ELECTRUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.ELECTRUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.ELECTRUM_INGOT)))
                .offerTo(recipeExporter, "electrum_shovel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SimpleElectrumItems.ELECTRUM_HOE)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', SimpleElectrumItems.ELECTRUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.ELECTRUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.ELECTRUM_INGOT)))
                .offerTo(recipeExporter, "electrum_hoe");


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.SILVER_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_helmet");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.SILVER_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_chestplate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.SILVER_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_leggings");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SimpleElectrumItems.SILVER_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', SimpleElectrumItems.SILVER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(SimpleElectrumItems.SILVER_INGOT),
                        FabricRecipeProvider.conditionsFromItem((SimpleElectrumItems.SILVER_INGOT)))
                .offerTo(recipeExporter, "silver_boots");
    }
}

