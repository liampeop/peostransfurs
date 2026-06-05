package com.Peoperer.peostransfurs.item;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.ModEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM,Peostransfurs.MODID);

    public static final RegistryObject<SpawnEggItem> TEAL_DRAGON_SPAWN_EGG = ITEMS.register("teal_dragon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TEAL_DRAGON, 0x3737CD, 0x008888,
                    new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> WHITE_MOUSE_SPAWN_EGG = ITEMS.register("white_mouse_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WHITE_MOUSE, 0xD3D3D3, 0xDB91E3,
                    new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> BROWN_MOUSE_SPAWN_EGG = ITEMS.register("brown_mouse_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BROWN_MOUSE, 0xC78A29, 0xDB91E3,
                    new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> LATEX_MYLO_PANDA_SPAWN_EGG = ITEMS.register("latex_mylo_panda_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.LATEX_MYLO_PANDA, 0x49CFF4, 0xEE3B99,
                    new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> LATEX_DRONE_WOLF_SPAWN_EGG = ITEMS.register("latex_drone_wolf_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.LATEX_DRONE_WOLF, 0x000000, 0x0000FF,
                    new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> RED_LATEX_MYLO_PANDA_SPAWN_EGG = ITEMS.register("red_latex_drone_wolf_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RED_LATEX_DRONE_WOLF, 0x000000, 0xFF0000,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
