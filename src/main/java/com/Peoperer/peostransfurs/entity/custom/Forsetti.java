package com.Peoperer.peostransfurs.entity.custom;

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

public class Forsetti extends ChangedEntity {
    public Forsetti(EntityType<? extends ChangedEntity> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttribures() {
        return ChangedEntity.createLatexAttributes()
                .add(Attributes.MOVEMENT_SPEED, 1.2d)
                .add(ForgeMod.SWIM_SPEED.get(), 0.75d)
                .add(Attributes.JUMP_STRENGTH, 0.35d)
                .add(Attributes.MAX_HEALTH, 24.0d);
    }

    @Override
    protected void setAttributes(AttributeMap attributes) {
        super.setAttributes(attributes);
        AttributePresets.catLike(attributes);
    }

    @Override
    public TransfurMode getTransfurMode() {
        return TransfurMode.NONE;
    }

    @Override
    public Color3 getTransfurColor(TransfurCause cause) {
        return Color3.WHITE;
    }
}
