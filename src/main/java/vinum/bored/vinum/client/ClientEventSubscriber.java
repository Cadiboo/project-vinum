package vinum.bored.vinum.client;

import vinum.bored.vinum.Vinum;
import vinum.bored.vinum.init.VinumItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = Vinum.MODID, value = Side.CLIENT)
public final class ClientEventSubscriber {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        registerModel(VinumItems.ITEM_TEST);
        //Generic Items
        registerModel(VinumItems.CORK_BARK);
        registerModel(VinumItems.WINE_CORK);
        registerModel(VinumItems.WINE_PRESS);
        registerModel(VinumItems.WINE_YEAST);
        registerModel(VinumItems.LEAD_INGOT);
        registerModel(VinumItems.LEAD_POWDER);
        registerModel(VinumItems.IRON_POWDER);
        //Wine Bottles
        registerModel(VinumItems.WINE_BOTTLE_EMPTY);
        registerModel(VinumItems.WINE_BOTTLE_CHARDONNAY);
        registerModel(VinumItems.WINE_BOTTLE_SAUVIGNON_BLANC);
        registerModel(VinumItems.WINE_BOTTLE_CABERNET_SAUVIGNON);
        registerModel(VinumItems.WINE_BOTTLE_MERLOT);
        registerModel(VinumItems.WINE_BOTTLE_PINOT_NOIR);
        registerModel(VinumItems.WINE_BOTTLE_ZINFANDEL);
        //Wine Glasses
        registerModel(VinumItems.WINE_GLASS_EMPTY);
        registerModel(VinumItems.WINE_GLASS_CHARDONNAY);
        registerModel(VinumItems.WINE_GLASS_SAUVIGNON_BLANC);
        registerModel(VinumItems.WINE_GLASS_CABERNET_SAUVIGNON);
        registerModel(VinumItems.WINE_GLASS_MERLOT);
        registerModel(VinumItems.WINE_GLASS_PINOT_NOIR);
        registerModel(VinumItems.WINE_GLASS_ZINFANDEL);
        //Grapes
        registerModel(VinumItems.GRAPES_CHARDONNAY);
        registerModel(VinumItems.GRAPES_SAUVIGNON_BLANC);
        registerModel(VinumItems.GRAPES_CABERNET_SAUVIGNON);
        registerModel(VinumItems.GRAPES_MERLOT);
        registerModel(VinumItems.GRAPES_PINOT_NOIR);
        registerModel(VinumItems.GRAPES_ZINFANDEL);
        //Grape Juice
        registerModel(VinumItems.GRAPE_JUICE_CHARDONNAY);
        registerModel(VinumItems.GRAPE_JUICE_SAUVIGNON_BLANC);
        registerModel(VinumItems.GRAPE_JUICE_CABERNET_SAUVIGNON);
        registerModel(VinumItems.GRAPE_JUICE_MERLOT);
        registerModel(VinumItems.GRAPE_JUICE_PINOT_NOIR);
        registerModel(VinumItems.GRAPE_JUICE_ZINFANDEL);
        //Grape Seeds
        registerModel(VinumItems.GRAPE_SEEDS_CHARDONNAY);
        registerModel(VinumItems.GRAPE_SEEDS_SAUVIGNON_BLANC);
        registerModel(VinumItems.GRAPE_SEEDS_CABERNET_SAUVIGNON);
        registerModel(VinumItems.GRAPE_SEEDS_MERLOT);
        registerModel(VinumItems.GRAPE_SEEDS_PINOT_NOIR);
        registerModel(VinumItems.GRAPE_SEEDS_ZINFANDEL);

    }

    private static void registerModel(Item item) {

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}
