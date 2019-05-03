package com.ivector.weedz.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.MARIJUANA_LEAF, new ItemStack(ModItems.DRIED_MARIJUANA, 1), 0.5f);
	}

}
