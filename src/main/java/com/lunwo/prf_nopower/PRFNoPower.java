package com.lunwo.prf_nopower;

import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

import java.awt.*;

@Mod(PRFNoPower.MODID)
public class PRFNoPower {
    public static final String MODID = "prf_nopower";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PRFNoPower(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.CONFIG_SPEC);
    }
}
