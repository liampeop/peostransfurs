package com.Peoperer.peostransfurs.entity.custom;

import net.ltxprogrammer.changed.entity.AttributePresets;
import net.ltxprogrammer.changed.entity.ChangedEntity;
import net.ltxprogrammer.changed.entity.TransfurCause;
import net.ltxprogrammer.changed.entity.TransfurMode;
import net.ltxprogrammer.changed.mixin.compatibility.Pehkui.ScaleTypeMixin;
import net.ltxprogrammer.changed.util.Color3;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

public class White_Mouse extends ChangedEntity {
    public White_Mouse(EntityType<? extends ChangedEntity> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttribures() {
        return ChangedEntity.createLatexAttributes()
                .add(Attributes.MOVEMENT_SPEED, 1.0d)
                .add(ForgeMod.SWIM_SPEED.get(), 1.0d)
                .add(Attributes.MAX_HEALTH, 20.0d)
                .add(ForgeMod.STEP_HEIGHT_ADDITION.get(), 0.5d);
    }

    @Override
    protected void setAttributes(AttributeMap attributes) {
        super.setAttributes(attributes);
        AttributePresets.playerLike(attributes);
    }

    @Override
    public TransfurMode getTransfurMode() {
        return TransfurMode.REPLICATION;
    }

    @Override
    public Color3 getTransfurColor(TransfurCause cause) {
        return Color3.BLUE;
    }
}