package com.lunwo.prf_nopower.mixin;

import mrtjp.projectred.fabrication.tile.PackagingTableBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PackagingTableBlockEntity.class)
public class PackagingTable {
    @Inject(at = @At("RETURN"), method = "tickWork", cancellable = true)
    private void tickWork(CallbackInfoReturnable<Integer> cir){
        cir.setReturnValue(40);
    }
}
