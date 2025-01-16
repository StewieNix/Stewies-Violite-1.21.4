package com.stewienix.stewiesviolite.item.equipment;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

public interface EquipmentAssets {
    ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));
    ResourceKey<EquipmentAsset> VIOLITE = createId("violite");

    static ResourceKey<EquipmentAsset> createId(String pName) {
        return ResourceKey.create(ROOT_ID, ResourceLocation.withDefaultNamespace(pName));
    }
}
