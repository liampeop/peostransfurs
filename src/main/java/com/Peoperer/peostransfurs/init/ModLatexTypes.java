package com.Peoperer.peostransfurs.init;

import com.Peoperer.peostransfurs.changed.RedSpreadingLatexType;
import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.entity.latex.LatexType;
import net.ltxprogrammer.changed.entity.latex.SpreadingLatexType;
import net.ltxprogrammer.changed.init.ChangedLatexTypes;
import net.ltxprogrammer.changed.init.ChangedRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModLatexTypes {
    public static final DeferredRegister<LatexType> REGISTRY = ChangedRegistry.LATEX_TYPE.createDeferred(Changed.MODID);


    public static final RegistryObject<RedSpreadingLatexType> RED_LATEX = REGISTRY.register("red_latex", RedSpreadingLatexType::new);

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
