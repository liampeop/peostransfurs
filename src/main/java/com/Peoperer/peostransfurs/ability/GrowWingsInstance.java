package com.Peoperer.peostransfurs.ability;

import com.Peoperer.peostransfurs.init.ModTransfurVariants;
import net.ltxprogrammer.changed.ability.AbstractAbility;
import net.ltxprogrammer.changed.ability.AbstractAbilityInstance;
import net.ltxprogrammer.changed.ability.IAbstractChangedEntity;
import net.ltxprogrammer.changed.entity.TransfurCause;
import net.ltxprogrammer.changed.entity.TransfurContext;
import net.ltxprogrammer.changed.entity.variant.TransfurVariant;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.minecraft.world.entity.player.Player;

public class GrowWingsInstance extends AbstractAbilityInstance {
    public boolean shrunk = false;

    public GrowWingsInstance(AbstractAbility<?> ability, IAbstractChangedEntity entity) {
        super(ability, entity);
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public boolean canKeepUsing() {
        return true;
    }

    @Override
    public void startUsing() {
        if (entity.getEntity() instanceof Player player) {
            TransfurVariant<?> transfurVariant = entity.getSelfVariant();
            TransfurVariant<?> targetVariant = ModTransfurVariants.FORSETTI.get();
            if (transfurVariant.is(ModTransfurVariants.FORSETTI.get())) {
                targetVariant = ModTransfurVariants.WINGED_FORSETTI.get();
            }

            ProcessTransfur.setPlayerTransfurVariant(player, targetVariant, TransfurContext.hazard(TransfurCause.GRAB_REPLICATE));
        }
    }
    @Override
    public void tick() {

    }

    @Override
    public void stopUsing() {

    }

}
