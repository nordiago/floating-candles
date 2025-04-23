package com.nordiago.floating_candles.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CandleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CandleBlock.class)
public class CandleBlockMixin {

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    protected void onCanPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        // Skip the vanilla check for Block.sideCoversSmallSquare()
        info.setReturnValue(true);
   }
}
