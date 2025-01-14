package com.stewienix.stewiesviolite.datagen;

import com.stewienix.stewiesviolite.StewiesViolite;
import com.stewienix.stewiesviolite.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StewiesViolite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.VIOLITE_INGOT.get());
        basicItem(ModItems.RAW_VIOLITE.get());

        basicItem(ModItems.CHISEL.get());

        handheldItem(ModItems.VIOLITE_SWORD);
        handheldItem(ModItems.VIOLITE_AXE);
        handheldItem(ModItems.VIOLITE_PICKAXE);
        handheldItem(ModItems.VIOLITE_SHOVEL);
        handheldItem(ModItems.VIOLITE_HOE);
        handheldItem(ModItems.VIOLITE_HAMMER);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(StewiesViolite.MOD_ID, "item/" + item.getId().getPath()));
    }
}
