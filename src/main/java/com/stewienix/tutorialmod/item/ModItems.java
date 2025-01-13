package com.stewienix.tutorialmod.item;

import com.stewienix.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> VIOLITE_INGOT = ITEMS.register("violite_ingot",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("tutorialmod:violite_ingot")))));
    public static final RegistryObject<Item> RAW_VIOLITE = ITEMS.register("raw_violite",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("tutorialmod:raw_violite")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
