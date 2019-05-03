package com.ivector.weedz.init;

import java.util.ArrayList;
import java.util.List;

import com.ivector.weedz.items.ItemBase;
import com.ivector.weedz.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// items	
	public static final Item MARIJUANA_BLUNT = new ItemBase("marijuana_blunt");
	public static final Item MARIJUANA_LEAF = new ItemBase("marijuana_leaf");
	public static final Item DRIED_MARIJUANA = new ItemBase("dried_marijuana");
	
	// Materials
	public static final ToolMaterial MATERIAL_MARIJUANA = EnumHelper.addToolMaterial("material_marijuana", 0, 100, 2.0f, 1.5f, 10);
	
	// Tools
	public static final ItemSword MARIJUANA_SWORD = new ToolSword("marijuana_sword", MATERIAL_MARIJUANA);
}
