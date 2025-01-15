package com.stewienix.stewiesviolite.datagen;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.item.ModItems;
import com.stewienix.stewiesviolite.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, StewiesViolite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ModTags.Items.VIOLITE_REPAIR)
                .add(ModItems.VIOLITE_INGOT.get());
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.GOLD_INGOT)
                .add(Items.GOLD_BLOCK);
        tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.VIOLITE_PICKAXE.get())
                .add(ModItems.VIOLITE_AXE.get())
                .add(ModItems.VIOLITE_SHOVEL.get())
                .add(ModItems.VIOLITE_HOE.get())
                .add(ModItems.VIOLITE_HAMMER.get());
        tag(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.VIOLITE_SWORD.get());
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.VIOLITE_HELMET.get())
                .add(ModItems.VIOLITE_CHESTPLATE.get())
                .add(ModItems.VIOLITE_LEGGINGS.get())
                .add(ModItems.VIOLITE_BOOTS.get());
    }
}
