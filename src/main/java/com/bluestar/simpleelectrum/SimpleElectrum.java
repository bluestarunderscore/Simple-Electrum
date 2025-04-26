package com.bluestar.simpleelectrum;

import com.bluestar.simpleelectrum.blocks.SimpleElectrumBlocks;
import com.bluestar.simpleelectrum.items.SimpleElectrumItems;
import com.bluestar.simpleelectrum.world.gen.SimpleElectrumWorldGen;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleElectrum implements ModInitializer {
	public static final String MOD_ID = "simple_electrum";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SimpleElectrumItems.initialize();
		SimpleElectrumBlocks.initialize();
		SimpleElectrumWorldGen.generateWorldGen();
	}
}