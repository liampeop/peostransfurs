package com.Peoperer.peostransfurs.init;

import com.Peoperer.peostransfurs.Peostransfurs;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.item.Syringe;
import net.ltxprogrammer.changed.util.UniversalDist;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.Peoperer.peostransfurs.init.ModTransfurVariants.TRANSFUR_VARIANTS;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Peostransfurs.MODID);

    public static final Supplier<CreativeModeTab> PEOS_TRANSFURS_TAB = CREATIVE_MODE_TAB.register("peops_transfurs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ChangedItems.SYRINGE.get()))
                    .title(Component.translatable("creativetab.peostransfurs.peops_transfurs_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        ModItems.ITEMS.getEntries().forEach((itemRegistryObject) -> {
                                    output.accept(itemRegistryObject.get());
                                });
                        Stream<SpawnEggItem> var10000 = ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).filter(SpawnEggItem.class::isInstance).map(SpawnEggItem.class::cast);
                        Objects.requireNonNull(output);
                        var10000.forEach(output::accept);
                        TRANSFUR_VARIANTS.getEntries().forEach((variant) -> {
                            ItemStack stack = new ItemStack(ChangedItems.LATEX_SYRINGE.get());
                            Syringe.setOwner(stack, UniversalDist.getLocalPlayer());
                            Syringe.setPureVariant(stack, variant.getId());
                            output.accept(stack);
                        } );
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
