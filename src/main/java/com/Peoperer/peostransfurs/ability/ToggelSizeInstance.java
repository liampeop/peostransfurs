package com.Peoperer.peostransfurs.ability;

import net.ltxprogrammer.changed.ability.AbstractAbility;
import net.ltxprogrammer.changed.ability.AbstractAbilityInstance;
import net.ltxprogrammer.changed.ability.IAbstractChangedEntity;
import virtuoel.pehkui.api.ScaleTypes;

public class ToggelSizeInstance extends AbstractAbilityInstance {
    public boolean shrunk = false;

    public ToggelSizeInstance(AbstractAbility<?> ability, IAbstractChangedEntity entity) {
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
        if (this.shrunk) {
            ScaleTypes.BASE.getScaleData(this.entity.getEntity()).setScale(1.0f);
            this.shrunk = false;
        } else {
            ScaleTypes.BASE.getScaleData(this.entity.getEntity()).setScale(0.4f);
            this.shrunk = true;
        }
    }

    @Override
    public void tick() {

    }

    @Override
    public void stopUsing() {

    }

    public void onRemove() {
        super.onRemove();
        ScaleTypes.BASE.getScaleData(this.entity.getEntity()).setScale(1.0f);
        this.shrunk = false;
    }
}
