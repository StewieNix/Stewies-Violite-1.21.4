package com.stewienix.stewiesviolite.block;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.block.custom.GoldConverterBlock;
import com.stewienix.stewiesviolite.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StewiesViolite.MOD_ID);

    public static final RegistryObject<Block> VIOLITE_BLOCK = registerBlock("violite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("stewiesviolite:violite_block")))));

    public static final RegistryObject<Block> VIOLITE_ORE_BLOCK = registerBlock("violite_ore_block",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("stewiesviolite:violite_ore_block")))));

    public static final RegistryObject<Block> BLOCK_OF_RAW_VIOLITE = registerBlock("block_of_raw_violite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("stewiesviolite:block_of_raw_violite")))));

    public static final RegistryObject<Block> DEEPSLATE_VIOLITE_ORE_BLOCK = registerBlock("deepslate_violite_ore_block",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("stewiesviolite:deepslate_violite_ore_block")))));

    public static final RegistryObject<Block> GOLD_CONVERTER_BLOCK = registerBlock("gold_converter_block",
            () -> new GoldConverterBlock(BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("stewiesviolite:gold_converter_block")))));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:" + name)))));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
