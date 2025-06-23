package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.common.entity.Tortoise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.constant.DataTickets;
import net.geckolib.model.GeoBone;
import net.geckolib.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@Environment(EnvType.CLIENT)
public class TortoiseModel extends GeoModel<Tortoise> {

    @Override
    @SuppressWarnings("removal")
    public @NotNull ResourceLocation getModelResource(Tortoise tortoise) {
        return new ResourceLocation(Naturalist.MOD_ID, "geo/entity/tortoise.geo.json");
    }

    @Override
    @SuppressWarnings("removal")
    public ResourceLocation getTextureResource(@NotNull Tortoise tortoise) {
        return switch (tortoise.getVariant()) {
            case 1 -> new ResourceLocation(Naturalist.MOD_ID, "textures/entity/tortoise/green.png");
            case 2 -> new ResourceLocation(Naturalist.MOD_ID, "textures/entity/tortoise/black.png");
            default -> new ResourceLocation(Naturalist.MOD_ID, "textures/entity/tortoise/brown.png");
        };
    }

    @Override
    public ResourceLocation getAnimationResource(Tortoise tortoise) {
        return new ResourceLocation(Naturalist.MOD_ID, "animations/tortoise.rp_anim.json");
    }

    @Override
    public void setCustomAnimations(@NotNull Tortoise entity, long instanceId, AnimationState<Tortoise> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        CoreGeoBone head = this.getAnimationProcessor().getBone("head");

        if (entity.isBaby()) {
            head.setScaleX(1.4F);
            head.setScaleY(1.4F);
            head.setScaleZ(1.4F);
        } else {
            head.setScaleX(1.0F);
            head.setScaleY(1.0F);
            head.setScaleZ(1.0F);
        }

        head.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
        head.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
    }
}
