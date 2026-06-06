package com.Peoperer.peostransfurs;

import com.Peoperer.peostransfurs.entity.ModAbilities;
import com.Peoperer.peostransfurs.entity.ModEntities;
import com.Peoperer.peostransfurs.entity.ModTransfurVariants;
import com.Peoperer.peostransfurs.entity.client.*;
import com.Peoperer.peostransfurs.entity.custom.*;
import com.Peoperer.peostransfurs.item.ModCreativeModeTabs;
import com.Peoperer.peostransfurs.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.Peoperer.peostransfurs.entity.ModEntities.*;
import static net.ltxprogrammer.changed.init.ChangedEntityRenderers.registerHumanoid;

@Mod(Peostransfurs.MODID)
public class Peostransfurs {
    public static final String MODID = "peostransfurs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Peostransfurs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        ModEntities.register(modEventBus);
        ModAbilities.register(modEventBus);
        ModTransfurVariants.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void registerAttributes(EntityAttributeCreationEvent event) {
            event.put(TEAL_DRAGON.get(), Teal_Dragon.createAttribures().build());
            event.put(WHITE_MOUSE.get(), White_Mouse.createAttribures().build());
            event.put(BROWN_MOUSE.get(), Brown_Mouse.createAttribures().build());
            event.put(LATEX_MYLO_PANDA.get(), Latex_Mylo_Panda.createAttribures().build());
            event.put(LATEX_DRONE_WOLF.get(), Latex_Drone_Wolf.createAttribures().build());
            event.put(RED_LATEX_DRONE_WOLF.get(), Red_Latex_Drone_Wolf.createAttribures().build());
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(Teal_Dragon_Model.LAYER_LOCATION, Teal_Dragon_Model::createBodyLayer);
            event.registerLayerDefinition(White_Mouse_Model.LAYER_LOCATION, White_Mouse_Model::createBodyLayer);
            event.registerLayerDefinition(Brown_Mouse_Model.LAYER_LOCATION, Brown_Mouse_Model::createBodyLayer);
            event.registerLayerDefinition(Latex_Mylo_Panda_Model.LAYER_LOCATION, Latex_Mylo_Panda_Model::createBodyLayer);
            event.registerLayerDefinition(Latex_Drone_Wolf_Model.LAYER_LOCATION, Latex_Drone_Wolf_Model::createBodyLayer);
            event.registerLayerDefinition(Red_Latex_Drone_Wolf_Model.LAYER_LOCATION, Red_Latex_Drone_Wolf_Model::createBodyLayer);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            registerHumanoid(event, TEAL_DRAGON.get(), Teal_Dragon_Renderer::new);
            registerHumanoid(event, WHITE_MOUSE.get(), White_Mouse_Renderer::new);
            registerHumanoid(event, BROWN_MOUSE.get(), Brown_Mouse_Renderer::new);
            registerHumanoid(event, LATEX_MYLO_PANDA.get(), Latex_Mylo_Panda_Renderer::new);
            registerHumanoid(event, LATEX_DRONE_WOLF.get(), Latex_Drone_Wolf_Renderer::new);
            registerHumanoid(event, RED_LATEX_DRONE_WOLF.get(), Red_Latex_Drone_Wolf_Renderer::new);
        }
    }
}
