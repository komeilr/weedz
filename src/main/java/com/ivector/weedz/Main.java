package com.ivector.weedz;

import com.ivector.weedz.init.ModRecipes;
import com.ivector.weedz.proxy.CommonProxy;
import com.ivector.weedz.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSION)
public class Main {
	
	@Mod.Instance
	public static Main instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();		
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	

}
