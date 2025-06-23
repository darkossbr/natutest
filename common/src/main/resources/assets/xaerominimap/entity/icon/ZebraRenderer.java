package com.starfish_studios.naturalist.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.client.model.ZebraModel;
import com.starfish_studios.naturalist.common.entity.Alligator;
import com.starfish_studios.naturalist.common.entity.Zebra;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class ZebraRenderer extends AbstractHorseRenderer<Zebra, ZebraModel> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Naturalist.MOD_ID, "zebra"), "main");

    public ZebraRenderer(EntityRendererProvider.@NotNull Context context) {
        super(context, new ZebraModel(context.bakeLayer(LAYER_LOCATION)), 1.1F);
    }

//    @Override
//    public float getMotionAnimThreshold(Zebra animatable) {
//        return 0.000001f;
//    }

    @Override
    public ResourceLocation getTextureLocation(Zebra entity) {
        return new ResourceLocation(Naturalist.MOD_ID, "textures/entity/zebra.png");
    }

    @Override
    public void render(Zebra entity, float entityYaw, float partialTick, PoseStack poseStack, net.minecraft.client.renderer.MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.8F, 0.8F, 0.8F);
        }
        else {
            poseStack.scale(0.8F, 0.8F, 0.8F);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
