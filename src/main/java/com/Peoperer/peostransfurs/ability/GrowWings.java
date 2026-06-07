package com.Peoperer.peostransfurs.ability;

import com.Peoperer.peostransfurs.entity.Forsetti;
import com.Peoperer.peostransfurs.entity.client.Forsetti_Model;
import com.Peoperer.peostransfurs.init.ModEntities;
import com.Peoperer.peostransfurs.init.ModTransfurVariants;
import net.ltxprogrammer.changed.ability.AbstractAbility;
import net.ltxprogrammer.changed.ability.IAbstractChangedEntity;
import net.ltxprogrammer.changed.ability.SimpleAbility;
import net.ltxprogrammer.changed.entity.ChangedEntity;
import net.ltxprogrammer.changed.entity.variant.TransfurVariant;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

import java.util.Collection;
import java.util.Collections;

public class GrowWings extends AbstractAbility<GrowWingsInstance> {
    public GrowWings() {
        super(GrowWingsInstance::new);
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
        return Collections.singleton(Component.translatable("ability.peostransfurs.wing.desc"));
    }
}
