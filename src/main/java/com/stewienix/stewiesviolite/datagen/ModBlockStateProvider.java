package com.stewienix.stewiesviolite.datagen;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.block.ModBlocks;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, StewiesViolite.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VIOLITE_BLOCK);
        blockWithItem(ModBlocks.BLOCK_OF_RAW_VIOLITE);

        blockWithItem(ModBlocks.VIOLITE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_VIOLITE_ORE_BLOCK);

        blockWithItem(ModBlocks.GOLD_CONVERTER_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
