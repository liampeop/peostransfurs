package com.Peoperer.peostransfurs.entity;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.Brown_Mouse;
import com.Peoperer.peostransfurs.entity.custom.Latex_Mylo_Panda;
import com.Peoperer.peostransfurs.entity.custom.Teal_Dragon;
import com.Peoperer.peostransfurs.entity.custom.White_Mouse;
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

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
