package com.ivector.weedz.init;

import java.util.ArrayList;
import java.util.List;

import com.ivector.weedz.blocks.MarijuanaBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block WEED_BLOCK = new MarijuanaBlock("weed_block", Material.WOOD);

}
