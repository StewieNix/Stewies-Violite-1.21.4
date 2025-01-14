package com.stewienix.stewiesviolite.datagen;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.block.ModBlocks;
import com.stewienix.stewiesviolite.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StewiesViolite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VIOLITE_BLOCK.get())
                .add(ModBlocks.BLOCK_OF_RAW_VIOLITE.get())
                .add(ModBlocks.VIOLITE_ORE_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_VIOLITE_ORE_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.VIOLITE_BLOCK.get())
                .add(ModBlocks.BLOCK_OF_RAW_VIOLITE.get())
                .add(ModBlocks.VIOLITE_ORE_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_VIOLITE_ORE_BLOCK.get());

        tag(ModTags.Blocks.NEEDS_VIOLITE_TOOL)
                .add(ModBlocks.BLOCK_OF_RAW_VIOLITE.get())
                .add(Blocks.OBSIDIAN)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_VIOLITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_VIOLITE_TOOL);
    }
}
