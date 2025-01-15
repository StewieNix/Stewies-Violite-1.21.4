package com.stewienix.stewiesviolite.item.Custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoodProperties {
    public static final FoodProperties VIOLITE_PIZZA = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final Consumable VIOLITE_PIZZA_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200), 1.0f)).build();


}
