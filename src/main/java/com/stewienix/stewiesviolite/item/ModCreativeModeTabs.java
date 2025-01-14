package com.stewienix.stewiesviolite.item;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StewiesViolite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VIOLITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("violite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_VIOLITE.get()))
                    .title(Component.translatable("creativetab.stewiesviolite.violite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_VIOLITE.get());
                        output.accept(ModItems.VIOLITE_INGOT.get());
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.VIOLITE_SWORD.get());
                        output.accept(ModItems.VIOLITE_AXE.get());
                        output.accept(ModItems.VIOLITE_PICKAXE.get());
                        output.accept(ModItems.VIOLITE_SHOVEL.get());
                        output.accept(ModItems.VIOLITE_HOE.get());
                        output.accept(ModItems.VIOLITE_HAMMER.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> VIOLITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("violite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.VIOLITE_BLOCK.get()))
                    .withTabsBefore(VIOLITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.stewiesviolite.violite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.VIOLITE_BLOCK.get());
                        output.accept(ModBlocks.BLOCK_OF_RAW_VIOLITE.get());
                        output.accept(ModBlocks.VIOLITE_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_VIOLITE_ORE_BLOCK.get());
                        output.accept(ModBlocks.GOLD_CONVERTER_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
