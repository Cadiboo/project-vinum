package vinum.bored.vinum;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vinum.bored.vinum.proxy.IProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Vinum.MODID, name = Vinum.NAME, version = Vinum.VERSION, acceptedMinecraftVersions = "[1.12, 1.12.2]")

public class Vinum {
	public static final String MODID = "vinum";
	public static final String NAME = "Vinum";
	public static final String VERSION = "0.0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(Vinum.MODID);
	
	public static final String CLIENT = "vinum.bored.vinum.proxy.ClientProxy";
	public static final String SERVER = "vinum.bored.vinum.proxy.ServerProxy";
	@SidedProxy(clientSide = Vinum.CLIENT, serverSide = Vinum.SERVER)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info(Vinum.NAME + " " + Vinum.VERSION + " PreInit.");
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		LOGGER.info(Vinum.NAME + " " + Vinum.VERSION + " Init.");
		proxy.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info(Vinum.NAME + " " + Vinum.VERSION + " PostInit");
		proxy.postInit(event);
	}
}
