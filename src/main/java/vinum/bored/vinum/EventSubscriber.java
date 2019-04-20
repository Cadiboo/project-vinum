package vinum.bored.vinum;

import vinum.bored.vinum.Vinum;
import vinum.bored.vinum.item.BasicItem;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Vinum.MODID)
public final class EventSubscriber {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {

		final Item[] items = {

				new BasicItem().setRegistryName("test_item").setUnlocalizedName(Vinum.MODID + "." + "test_item"),
				//Wine Bottles
				new BasicItem().setRegistryName("cork_bark").setUnlocalizedName(Vinum.MODID + "." + "cork_bark"),
				new BasicItem().setRegistryName("wine_cork").setUnlocalizedName(Vinum.MODID + "." + "wine_cork"),
				new BasicItem().setRegistryName("wine_press").setUnlocalizedName(Vinum.MODID + "." + "wine_press"),
				new BasicItem().setRegistryName("wine_yeast").setUnlocalizedName(Vinum.MODID + "." + "wine_yeast"),
				new BasicItem().setRegistryName("lead_ingot").setUnlocalizedName(Vinum.MODID + "." + "lead_ingot"),
				new BasicItem().setRegistryName("lead_powder").setUnlocalizedName(Vinum.MODID + "." + "lead_powder"),
				new BasicItem().setRegistryName("iron_powder").setUnlocalizedName(Vinum.MODID + "." + "iron_powder"),
				//Wine Bottles
				new BasicItem().setRegistryName("wine_bottle_empty").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_empty"),
				new BasicItem().setRegistryName("wine_bottle_chardonnay").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_chardonnay"),
				new BasicItem().setRegistryName("wine_bottle_sauvignon_blanc").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_sauvignon_blanc"),
				new BasicItem().setRegistryName("wine_bottle_cabernet_sauvignon").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_cabernet_sauvignon"),
				new BasicItem().setRegistryName("wine_bottle_merlot").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_merlot"),
				new BasicItem().setRegistryName("wine_bottle_pinot_noir").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_pinot_noir"),
				new BasicItem().setRegistryName("wine_bottle_zinfandel").setUnlocalizedName(Vinum.MODID + "." + "wine_bottle_zinfandel"),
				//Wine Glasses
				new BasicItem().setRegistryName("wine_glass_empty").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_empty"),
				new BasicItem().setRegistryName("wine_glass_chardonnay").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_chardonnay"),
				new BasicItem().setRegistryName("wine_glass_sauvignon_blanc").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_sauvignon_blanc"),
				new BasicItem().setRegistryName("wine_glass_cabernet_sauvignon").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_cabernet_sauvignon"),
				new BasicItem().setRegistryName("wine_glass_merlot").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_merlot"),
				new BasicItem().setRegistryName("wine_glass_pinot_noir").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_pinot_noir"),
				new BasicItem().setRegistryName("wine_glass_zinfandel").setUnlocalizedName(Vinum.MODID + "." + "wine_glass_zinfandel"),
				//Grapes
				new BasicItem().setRegistryName("grapes_chardonnay").setUnlocalizedName(Vinum.MODID + "." + "grapes_chardonnay"),
				new BasicItem().setRegistryName("grapes_sauvignon_blanc").setUnlocalizedName(Vinum.MODID + "." + "grapes_sauvignon_blanc"),
				new BasicItem().setRegistryName("grapes_cabernet_sauvignon").setUnlocalizedName(Vinum.MODID + "." + "grapes_cabernet_sauvignon"),
				new BasicItem().setRegistryName("grapes_merlot").setUnlocalizedName(Vinum.MODID + "." + "grapes_merlot"),
				new BasicItem().setRegistryName("grapes_pinot_noir").setUnlocalizedName(Vinum.MODID + "." +"grapes_pinot_noir"),
				new BasicItem().setRegistryName("grapes_zinfandel").setUnlocalizedName(Vinum.MODID + "." + "grapes_zinfandel"),
				//Grape Juice
				new BasicItem().setRegistryName("grape_juice_chardonnay").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_chardonnay"),
				new BasicItem().setRegistryName("grape_juice_sauvignon_blanc").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_sauvignon_blanc"),
				new BasicItem().setRegistryName("grape_juice_cabernet_sauvignon").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_cabernet_sauvignon"),
				new BasicItem().setRegistryName("grape_juice_merlot").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_merlot"),
				new BasicItem().setRegistryName("grape_juice_pinot_noir").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_pinot_noir"),
				new BasicItem().setRegistryName("grape_juice_zinfandel").setUnlocalizedName(Vinum.MODID + "." + "grape_juice_zinfandel"),
				//Grape Seeds
				new BasicItem().setRegistryName("grape_seeds_chardonnay").setUnlocalizedName(Vinum.MODID + "." + "grape_seeds_chardonnay"),
				new BasicItem().setRegistryName("grape_seeds_sauvignon_blanc").setUnlocalizedName(Vinum.MODID + "." + "grape_seeds_sauvignon_blanc"),
				new BasicItem().setRegistryName("grape_seeds_cabernet_sauvignon").setUnlocalizedName(Vinum.MODID + "." + "grape_seeds_cabernet_sauvignon"),
				new BasicItem().setRegistryName("grape_seeds_merlot").setUnlocalizedName(Vinum.MODID + "." + "grape_seeds_merlot"),
				new BasicItem().setRegistryName("grape_seeds_pinot_noir").setUnlocalizedName(Vinum.NAME + "." + "grape_seeds_pinot_noir"),
				new BasicItem().setRegistryName("grape_seeds_zinfandel").setUnlocalizedName(Vinum.MODID + "." + "grape_seeds_zinfandel")

		};

		event.getRegistry().registerAll(items);

	}

}
