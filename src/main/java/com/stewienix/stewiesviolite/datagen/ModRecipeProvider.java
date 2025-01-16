package com.stewienix.stewiesviolite.datagen;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.block.ModBlocks;
import com.stewienix.stewiesviolite.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(HolderLookup.Provider lookup, RecipeOutput recipeOutput) {
        super(lookup, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> VIOLITE_SMELTABLES = List.of(ModItems.RAW_VIOLITE.get(),
                ModBlocks.VIOLITE_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_VIOLITE_ORE_BLOCK.get());


        shaped(RecipeCategory.MISC, ModBlocks.VIOLITE_BLOCK.get())
                .pattern("VVV")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_RAW_VIOLITE.get())
                .pattern("vvv")
                .pattern("vvv")
                .pattern("vvv")
                .define('v', ModItems.RAW_VIOLITE.get())
                .unlockedBy(getHasName(ModItems.RAW_VIOLITE.get()), has(ModItems.RAW_VIOLITE.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.CHISEL.get())
                .pattern("   ")
                .pattern(" V ")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.COMBAT, ModItems.VIOLITE_SWORD.get())
                .pattern(" V ")
                .pattern(" V ")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.VIOLITE_AXE.get())
                .pattern(" VV")
                .pattern(" sV")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.VIOLITE_PICKAXE.get())
                .pattern("VVV")
                .pattern(" s ")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.VIOLITE_SHOVEL.get())
                .pattern(" V ")
                .pattern(" s ")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.VIOLITE_HOE.get())
                .pattern(" VV")
                .pattern(" s ")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GOLD_CONVERTER_BLOCK.get())
                .pattern("vvv")
                .pattern("vVv")
                .pattern("vvv")
                .define('v', ModItems.VIOLITE_INGOT.get())
                .define('V', ModBlocks.VIOLITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VIOLITE_BLOCK.get()), has(ModBlocks.VIOLITE_BLOCK.get())).save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.VIOLITE_HAMMER.get())
                .pattern("VVV")
                .pattern("VsV")
                .pattern(" s ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.FOOD, ModItems.VIOLITE_PIZZA.get())
                .pattern("   ")
                .pattern("MVM")
                .pattern("WWW")
                .define('M', Items.MILK_BUCKET)
                .define('V', ModItems.RAW_VIOLITE.get())
                .define('W', Items.WHEAT)
                .unlockedBy(getHasName(ModItems.RAW_VIOLITE.get()), has(ModItems.RAW_VIOLITE.get())).save(this.output);

        shaped(RecipeCategory.COMBAT, ModItems.VIOLITE_HELMET.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("   ")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.COMBAT, ModItems.VIOLITE_CHESTPLATE.get())
                .pattern("V V")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.COMBAT, ModItems.VIOLITE_LEGGINGS.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("V V")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shaped(RecipeCategory.COMBAT, ModItems.VIOLITE_BOOTS.get())
                .pattern("   ")
                .pattern("V V")
                .pattern("V V")
                .define('V', ModItems.VIOLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.VIOLITE_INGOT.get()), has(ModItems.VIOLITE_INGOT.get())).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.VIOLITE_INGOT.get(), 9)
                .requires(ModBlocks.VIOLITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VIOLITE_BLOCK.get()), has(ModBlocks.VIOLITE_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_VIOLITE.get(), 9)
                .requires(ModBlocks.BLOCK_OF_RAW_VIOLITE.get())
                .unlockedBy(getHasName(ModBlocks.BLOCK_OF_RAW_VIOLITE.get()), has(ModBlocks.BLOCK_OF_RAW_VIOLITE.get())).save(this.output);

        oreSmelting(VIOLITE_SMELTABLES, RecipeCategory.MISC, ModItems.VIOLITE_INGOT.get(), 0.25f, 200, "violite_ingot");
        oreBlasting(VIOLITE_SMELTABLES, RecipeCategory.MISC, ModItems.VIOLITE_INGOT.get(), 0.25f, 100, "violite_ingot");
    }

    protected void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, StewiesViolite.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }


}
