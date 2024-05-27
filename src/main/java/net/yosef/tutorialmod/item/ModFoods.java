package net.yosef.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().fast().saturationMod(.2f)
            .nutrition(2).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200),.5f).build();
}
