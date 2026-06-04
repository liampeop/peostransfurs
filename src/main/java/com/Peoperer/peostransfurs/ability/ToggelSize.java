package com.Peoperer.peostransfurs.ability;

import net.ltxprogrammer.changed.ability.AbstractAbility;
import net.ltxprogrammer.changed.ability.IAbstractChangedEntity;
import net.minecraft.network.chat.Component;

import java.util.Collection;
import java.util.Collections;

public class ToggelSize extends AbstractAbility<ToggelSizeInstance> {
    public ToggelSize() {
        super(ToggelSizeInstance::new);
    }

    @Override
    public int getChargeTime(IAbstractChangedEntity entity) {
        return 50;
    }

    @Override
    public UseType getUseType(IAbstractChangedEntity entity) {
        return UseType.CHARGE_TIME;
    }

    @Override
    public Collection<Component> getAbilityDescription(IAbstractChangedEntity entity) {
        return Collections.singleton(Component.literal("An ability to change your scale"));
    }
}

