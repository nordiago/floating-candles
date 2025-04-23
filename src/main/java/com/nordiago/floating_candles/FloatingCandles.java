package com.nordiago.floating_candles;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloatingCandles implements ModInitializer {

    public static final String MOD_ID = "floating_candles";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initialized Floating Candles");
    }
}
