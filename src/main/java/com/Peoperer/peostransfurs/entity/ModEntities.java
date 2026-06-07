package com.Peoperer.peostransfurs.entity;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Peostransfurs.MODID);

    public static final RegistryObject<EntityType<Teal_Dragon>> TEAL_DRAGON = ENTITY_TYPES.register("teal_dragon",
            () -> EntityType.Builder.of(Teal_Dragon::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("teal_dragon"));

    public static final RegistryObject<EntityType<White_Mouse>> WHITE_MOUSE = ENTITY_TYPES.register("white_mouse",
            () -> EntityType.Builder.of(White_Mouse::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("white_mouse"));

    public static final RegistryObject<EntityType<Brown_Mouse>> BROWN_MOUSE = ENTITY_TYPES.register("brown_mouse",
            () -> EntityType.Builder.of(Brown_Mouse::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("brown_mouse"));

    public static final RegistryObject<EntityType<Latex_Mylo_Panda>> LATEX_MYLO_PANDA = ENTITY_TYPES.register("latex_mylo_panda",
            () -> EntityType.Builder.of(Latex_Mylo_Panda::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("latex_mylo_panda"));

    public static final RegistryObject<EntityType<Latex_Drone_Wolf>> LATEX_DRONE_WOLF = ENTITY_TYPES.register("latex_drone_wolf",
            () -> EntityType.Builder.of(Latex_Drone_Wolf::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("latex_drone_wolf"));

    public static final RegistryObject<EntityType<Red_Latex_Drone_Wolf>> RED_LATEX_DRONE_WOLF = ENTITY_TYPES.register("red_latex_drone_wolf",
            () -> EntityType.Builder.of(Red_Latex_Drone_Wolf::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("red_latex_drone_wolf"));

    public static final RegistryObject<EntityType<Forsetti>> FORSETTI = ENTITY_TYPES.register("forsetti",
            () -> EntityType.Builder.of(Forsetti::new, MobCategory.MONSTER).clientTrackingRange(10). sized(0.7F, 1.93F).build("forsetti"));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
