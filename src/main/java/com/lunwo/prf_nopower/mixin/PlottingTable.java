package com.lunwo.prf_nopower.mixin;

import com.lunwo.prf_nopower.Config;
import mrtjp.projectred.fabrication.tile.PlottingTableBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlottingTableBlockEntity.class)
public class PlottingTable {
    private final int SPEED = Config.CONFIG.PlottingtableSpeed.get();
    @Inject(at = @At("RETURN"), method = "tickWork", cancellable = true)
    private void tickWork(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(SPEED);
    }
}
