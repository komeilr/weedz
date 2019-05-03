package com.ivector.weedz.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MarijuanaBlock extends BlockBase {

	public MarijuanaBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.CLOTH);
		setHardness(0.75f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 0);
	}
}
