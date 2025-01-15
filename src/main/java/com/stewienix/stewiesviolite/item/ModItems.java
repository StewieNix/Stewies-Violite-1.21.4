package com.stewienix.stewiesviolite.item;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.item.Custom.ChiselItem;
import com.stewienix.stewiesviolite.item.Custom.HammerItem;
import com.stewienix.stewiesviolite.item.Custom.ModFoodProperties;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StewiesViolite.MOD_ID);

    // Violite crafting ingredients
    public static final RegistryObject<Item> VIOLITE_INGOT = ITEMS.register("violite_ingot",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_ingot")))));
    public static final RegistryObject<Item> RAW_VIOLITE = ITEMS.register("raw_violite",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:raw_violite")))));

    // Violite tools and weapons
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(64).useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:chisel")))));

    public static final RegistryObject<Item> VIOLITE_SWORD = ITEMS.register("violite_sword",
            () -> new SwordItem(ModToolTiers.VIOLITE,  4, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_sword")))));

    public static final RegistryObject<Item> VIOLITE_PICKAXE = ITEMS.register("violite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VIOLITE, 1.5f, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_pickaxe")))));

    public static final RegistryObject<Item> VIOLITE_SHOVEL = ITEMS.register("violite_shovel",
            () -> new ShovelItem(ModToolTiers.VIOLITE, 1.5f, -3.0f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_shovel")))));

    public static final RegistryObject<Item> VIOLITE_AXE = ITEMS.register("violite_axe",
            () -> new AxeItem(ModToolTiers.VIOLITE, 5.5f, -3.2f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_axe")))));

    public static final RegistryObject<Item> VIOLITE_HOE = ITEMS.register("violite_hoe",
            () -> new HoeItem(ModToolTiers.VIOLITE, 0, -3.0f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_hoe")))));

    public static final RegistryObject<Item> VIOLITE_HAMMER = ITEMS.register("violite_hammer",
            () -> new HammerItem(ModToolTiers.VIOLITE, 5, -3.5f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_hammer")))));

    // Food
    public static final RegistryObject<Item> VIOLITE_PIZZA = ITEMS.register("violite_pizza",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VIOLITE_PIZZA, ModFoodProperties.VIOLITE_PIZZA_EFFECT).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("stewiesviolite:violite_pizza")))));

    // Armor
    public static final RegistryObject<Item> VIOLITE_HELMET = ITEMS.register("violite_helmet",
            () -> new ArmorItem(ModArmorMaterials.VIOLITE_ARMOR_MATERIAL, ArmorType.HELMET,
                    new Item.Properties().durability(ArmorType.HELMET.getDurability(35))));

    public static final RegistryObject<Item> VIOLITE_CHESTPLATE = ITEMS.register("violite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VIOLITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
                    new Item.Properties().durability(ArmorType.CHESTPLATE.getDurability(35))));

    public static final RegistryObject<Item> VIOLITE_LEGGINGS = ITEMS.register("violite_leggings",
            () -> new ArmorItem(ModArmorMaterials.VIOLITE_ARMOR_MATERIAL, ArmorType.LEGGINGS,
                    new Item.Properties().durability(ArmorType.LEGGINGS.getDurability(35))));

    public static final RegistryObject<Item> VIOLITE_BOOTS = ITEMS.register("violite_boots",
            () -> new ArmorItem(ModArmorMaterials.VIOLITE_ARMOR_MATERIAL, ArmorType.BOOTS,
                    new Item.Properties().durability(ArmorType.BOOTS.getDurability(35))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
