package com.Peoperer.peostransfurs.Support;

import net.foxyas.changedaddon.init.ChangedAddonAbilities;
import net.ltxprogrammer.changed.entity.variant.TransfurVariant;

public class ChangedAddon {
    public static void AddDash(TransfurVariant.Builder<?> builder) {
        builder.addAbility(ChangedAddonAbilities.DASH);
    }

    public static void AddLeap(TransfurVariant.Builder<?> builder) {
        builder.addAbility(ChangedAddonAbilities.LEAP);
    }
}
