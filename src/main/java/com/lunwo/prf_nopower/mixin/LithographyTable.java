package com.lunwo.prf_nopower.mixin;

import com.lunwo.prf_nopower.Config;
import mrtjp.projectred.fabrication.tile.LithographyTableBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LithographyTableBlockEntity.class)
public class LithographyTable {
    private final int SPEED = Config.CONFIG.LithographytableSpeed.get();
    @Inject(at = @At("RETURN"), method = "tickWork", cancellable = true)
    private void tickWork(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(SPEED);
    }
}
