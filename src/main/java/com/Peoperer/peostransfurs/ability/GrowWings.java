package com.Peoperer.peostransfurs.ability;

import net.ltxprogrammer.changed.ability.IAbstractChangedEntity;
import net.ltxprogrammer.changed.ability.SimpleAbility;
import net.minecraft.network.chat.Component;

import java.util.Collection;
import java.util.Collections;

public class GrowWings extends SimpleAbility {


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
        return Collections.singleton(Component.translatable("ability.peostransfurs.toggle_size.desc"));
    }
}
