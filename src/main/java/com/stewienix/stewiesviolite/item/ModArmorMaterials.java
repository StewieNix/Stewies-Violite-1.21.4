package com.stewienix.stewiesviolite.item;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.util.ModTags;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static final ArmorMaterial VIOLITE_ARMOR_MATERIAL = new ArmorMaterial(1200, Util.make(new EnumMap<>(ArmorType.class),
            attribute -> {
        attribute.put(ArmorType.BOOTS, 5);
        attribute.put(ArmorType.LEGGINGS, 7);
        attribute.put(ArmorType.CHESTPLATE, 9);
        attribute.put(ArmorType.HELMET, 5);
        attribute.put(ArmorType.BODY, 11);
            }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND,
            4f, 0.1f, ModTags.Items.VIOLITE_REPAIR, ResourceLocation.fromNamespaceAndPath(StewiesViolite.MOD_ID, "violite"));
}
