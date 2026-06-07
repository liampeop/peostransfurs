package com.Peoperer.peostransfurs.entity;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.Support.ChangedAddon;
import com.Peoperer.peostransfurs.entity.custom.*;
import net.ltxprogrammer.changed.entity.variant.TransfurVariant;
import net.ltxprogrammer.changed.init.ChangedAbilities;
import net.ltxprogrammer.changed.init.ChangedRegistry;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTransfurVariants {
    public static final DeferredRegister<TransfurVariant<?>> TRANSFUR_VARIANTS = ChangedRegistry.TRANSFUR_VARIANT.createDeferred(Peostransfurs.MODID);

    public static final RegistryObject<TransfurVariant<Teal_Dragon>> TEAL_DRAGON = TRANSFUR_VARIANTS.register("teal_dragon",
            () -> TransfurVariant.Builder.of(ModEntities.TEAL_DRAGON).glide().sound(ChangedSounds.TRANSFUR_BY_NOT_LATEX.getId()).build());

    public static final RegistryObject<TransfurVariant<Forsetti>> FORSETTI = TRANSFUR_VARIANTS.register("forsetti", () -> {
        var builder = TransfurVariant.Builder.of(ModEntities.FORSETTI).sound(ChangedSounds.TRANSFUR_BY_NOT_LATEX.getId());

        if (ModList.get().isLoaded("changed_addon")) {
            ChangedAddon.AddDash(builder);
            ChangedAddon.AddLeap(builder);
        }

        return builder.build();
    });

    public static final RegistryObject<TransfurVariant<White_Mouse>> WHITE_MOUSE = TRANSFUR_VARIANTS.register("white_mouse",
            () -> TransfurVariant.Builder.of(ModEntities.WHITE_MOUSE).doubleJump().addAbility(ChangedAbilities.GRAB_ENTITY_ABILITY).addAbility(ChangedAbilities.SWITCH_TRANSFUR_MODE).addAbility(ChangedAbilities.PUDDLE).addAbility(ModAbilities.TOGGLE_SIZE).sound(ChangedSounds.TRANSFUR_BY_LATEX.getId()).build());

    public static final RegistryObject<TransfurVariant<Brown_Mouse>> BROWN_MOUSE = TRANSFUR_VARIANTS.register("brown_mouse",
            () -> TransfurVariant.Builder.of(ModEntities.BROWN_MOUSE).doubleJump().addAbility(ChangedAbilities.GRAB_ENTITY_ABILITY).addAbility(ChangedAbilities.SWITCH_TRANSFUR_MODE).addAbility(ChangedAbilities.PUDDLE).addAbility(ModAbilities.TOGGLE_SIZE).sound(ChangedSounds.TRANSFUR_BY_LATEX.getId()).build());

    public static final RegistryObject<TransfurVariant<Latex_Mylo_Panda>> LATEX_MYLO_PANDA = TRANSFUR_VARIANTS.register("latex_mylo_panda",
            () -> TransfurVariant.Builder.of(ModEntities.LATEX_MYLO_PANDA).addAbility(ChangedAbilities.GRAB_ENTITY_ABILITY).addAbility(ChangedAbilities.SWITCH_TRANSFUR_MODE).addAbility(ChangedAbilities.PUDDLE).sound(ChangedSounds.TRANSFUR_BY_LATEX.getId()).build());

    public static final RegistryObject<TransfurVariant<Latex_Drone_Wolf>> LATEX_DRONE_WOLF = TRANSFUR_VARIANTS.register("latex_drone_wolf",
            () -> TransfurVariant.Builder.of(ModEntities.LATEX_DRONE_WOLF).addAbility(ChangedAbilities.GRAB_ENTITY_ABILITY).addAbility(ChangedAbilities.SWITCH_TRANSFUR_MODE).addAbility(ChangedAbilities.PUDDLE).sound(ChangedSounds.TRANSFUR_BY_LATEX.getId()).scares(AbstractSkeleton.class).noVision().absorbing().disableItems().weakMining().build());

    public static final RegistryObject<TransfurVariant<Red_Latex_Drone_Wolf>> RED_LATEX_DRONE_WOLF = TRANSFUR_VARIANTS.register("red_latex_drone_wolf",
            () -> TransfurVariant.Builder.of(ModEntities.RED_LATEX_DRONE_WOLF).addAbility(ChangedAbilities.GRAB_ENTITY_ABILITY).addAbility(ChangedAbilities.SWITCH_TRANSFUR_MODE).addAbility(ChangedAbilities.PUDDLE).sound(ChangedSounds.TRANSFUR_BY_LATEX.getId()).scares(AbstractSkeleton.class).noVision().absorbing().disableItems().weakMining().build());

    public static void register (IEventBus eventBus) {
        TRANSFUR_VARIANTS.register(eventBus);
    }
}
