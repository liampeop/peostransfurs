package com.Peoperer.peostransfurs.init;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.ability.ToggelSize;
import com.Peoperer.peostransfurs.ability.ToggelSizeInstance;
import net.ltxprogrammer.changed.ability.AbstractAbility;
import net.ltxprogrammer.changed.init.ChangedRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModAbilities {
    public static final DeferredRegister<AbstractAbility<?>> TRANSFUR_ABLITIES = ChangedRegistry.ABILITY.createDeferred(Peostransfurs.MODID);

    public static final RegistryObject<AbstractAbility<ToggelSizeInstance>> TOGGLE_SIZE = TRANSFUR_ABLITIES.register("toggle_size", ToggelSize::new);

    public static void register (IEventBus eventBus) {
        TRANSFUR_ABLITIES.register(eventBus);
    }
}
