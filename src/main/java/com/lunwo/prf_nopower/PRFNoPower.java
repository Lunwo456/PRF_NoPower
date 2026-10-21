package com.lunwo.prf_nopower;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(PRFNoPower.MODID)
public class PRFNoPower {
    public static final String MODID = "prf_nopower";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PRFNoPower(IEventBus modEventBus, ModContainer modContainer) {
    }
}
