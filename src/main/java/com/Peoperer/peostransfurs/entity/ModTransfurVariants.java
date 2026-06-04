package com.Peoperer.peostransfurs.entity;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.Teal_Dragon;
import net.ltxprogrammer.changed.entity.variant.TransfurVariant;
import net.ltxprogrammer.changed.init.ChangedRegistry;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTransfurVariants {
    private static final DeferredRegister<TransfurVariant<?>> TRANSFUR_VARIANTS = ChangedRegistry.TRANSFUR_VARIANT.createDeferred(Peostransfurs.MODID);

    public static final RegistryObject<TransfurVariant<Teal_Dragon>> TEAL_DRAGON = TRANSFUR_VARIANTS.register("teal_dragon",
            () -> TransfurVariant.Builder.of(ModEntities.TEAL_DRAGON).glide().sound(ChangedSounds.TRANSFUR_BY_NOT_LATEX.getId()).build());

    public static void register (IEventBus eventBus) {
        TRANSFUR_VARIANTS.register(eventBus);
    }
}
