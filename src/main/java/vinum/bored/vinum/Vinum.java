package vinum.bored.vinum;

import vinum.bored.vinum.block.ModBlocks;
import vinum.bored.vinum.item.ModItems;
import vinum.bored.vinum.proxy.CommonProxy;
import vinum.bored.vinum.ui.VinumTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Vinum.modid, name = Vinum.name, version = Vinum.version, acceptedMinecraftVersions = "[1.12, 1.12.2]")
public class Vinum {

	public static final String modid = "vinum";
	public static final String name = "Vinum";
	public static final String version = "0.0.1";

	@Mod.Instance(modid)
	public static Vinum instance;

	@SidedProxy(serverSide = "vinum.bored.vinum.proxy.CommonProxy", clientSide = "vinum.bored.vinum.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " " + version + " is loading!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	public static final VinumTab creativeTab = new VinumTab();
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		}
}