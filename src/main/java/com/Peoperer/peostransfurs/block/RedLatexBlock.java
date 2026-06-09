package com.Peoperer.peostransfurs.block;

import com.Peoperer.peostransfurs.changed.RedSpreadingLatexType;
import com.Peoperer.peostransfurs.init.ModLatexTypes;
import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.latex.SpreadingLatexType;
import net.ltxprogrammer.changed.world.LatexCoverState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class RedLatexBlock extends AbstractLatexBlock {
    public RedLatexBlock(Properties properties) {
        super(properties, RedSpreadingLatexType::new, null);
    }

    @Override
    public @NotNull LatexCoverState getLatexCoverState(BlockState blockState, BlockPos blockPos) {
        return ModLatexTypes.RED_LATEX.get().sourceCoverState();
    }
}
