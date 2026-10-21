package com.lunwo.prf_nopower;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static final Config CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final ModConfigSpec.IntValue PlottingtableSpeed;
    public final ModConfigSpec.IntValue LithographytableSpeed;
    public final ModConfigSpec.IntValue PackagingTableSpeed;

    private Config(ModConfigSpec.Builder builder) {
        PlottingtableSpeed = builder
                .comment("Plottingtable Speed")
                .defineInRange("Plottingtable Speed", 1, 1, 200);
        LithographytableSpeed = builder
                .comment("LithographytableSpeed")
                .defineInRange("Lithographytable Speed", 1, 1, 1200);
        PackagingTableSpeed = builder
                .comment("PackagingTableSpeed")
                .defineInRange("PackagingTable Speed", 1, 1, 400);
    }
    static {
        Pair<Config, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(Config::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }
}
