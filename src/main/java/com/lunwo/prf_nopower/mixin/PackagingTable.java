package com.lunwo.prf_nopower.mixin;

import com.lunwo.prf_nopower.Config;
import mrtjp.projectred.fabrication.tile.PackagingTableBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PackagingTableBlockEntity.class)
public class PackagingTable {
    @Unique
    private final int pRF_NoPower$SPEED = Config.CONFIG.PackagingTableSpeed.get();
    @Inject(at = @At("RETURN"), method = "tickWork", cancellable = true)
    private void tickWork(CallbackInfoReturnable<Integer> cir){
        cir.setReturnValue(pRF_NoPower$SPEED);
    }
}
