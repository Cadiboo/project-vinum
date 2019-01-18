package com.bored.vinum;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.bored.vinum.proxy.CommonProxy;
import com.bored.vinum.ui.VinumTab;

@Mod(modid = Vinum.modid, name = Vinum.name, version = Vinum.version, acceptedMinecraftVersions = "[1.12, 1.12.2]")
public class Vinum
{
    public static final String modid = "vinum";
    public static final String name = "Vinium";
    public static final String version = "0.0.1";
    
    @Mod.Instance(modid)
    public static Vinum instance;
    
    @SidedProxy(serverSide = "com.bored.vinum.proxy.CommonProxy", clientSide = "com.bored.vinum.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println(name + " " + version + " " + "is loading!");
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    
    public static final VinumTab creativeTab = new VinumTab();
}
