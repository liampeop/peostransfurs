package com.Peoperer.peostransfurs.entity;

import net.ltxprogrammer.changed.entity.AttributePresets;
import net.ltxprogrammer.changed.entity.ChangedEntity;
import net.ltxprogrammer.changed.entity.TransfurCause;
import net.ltxprogrammer.changed.entity.TransfurMode;
import net.ltxprogrammer.changed.util.Color3;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

public class Latex_Mylo_Panda extends ChangedEntity {
    public Latex_Mylo_Panda(EntityType<? extends ChangedEntity> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttribures() {
        return ChangedEntity.createLatexAttributes()
                .add(Attributes.MOVEMENT_SPEED, 1.2d)
                .add(ForgeMod.SWIM_SPEED.get(), 0.85d)
                .add(Attributes.MAX_HEALTH, 24.0d)
                .add(Attributes.ARMOR, 4.0d);
    }

    @Override
    protected void setAttributes(AttributeMap attributes) {
        super.setAttributes(attributes);
        AttributePresets.playerLike(attributes);
    }

    @Override
    public TransfurMode getTransfurMode() {
        return TransfurMode.ABSORPTION;
    }

    @Override
    public Color3 getTransfurColor(TransfurCause cause) {
        return Color3.TSC_BLUE;
    }
}
