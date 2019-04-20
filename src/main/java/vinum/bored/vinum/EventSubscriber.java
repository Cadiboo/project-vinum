package vinum.bored.vinum;

import vinum.bored.vinum.Vinum;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.google.common.base.Preconditions;
import javax.annotation.Nonnull;

@EventBusSubscriber(modid = Vinum.MODID)
public final class EventSubscriber {

	/**
	 * This method will be called by Forge when it is time for the mod to register its blocks.
	 * This method will always be called before the item registry method.
	 */
	@SubscribeEvent
	public static void onRegisterBlocksEvent(@Nonnull final RegistryEvent.Register<Block> event) {

		event.getRegistry().registerAll(
			setup(new Block(), "test_block")
		);

	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {

		final IForgeRegistry<Item> registry = event.getRegistry();

		registry.registerAll(
			setup(new Item(), "test_item"),
			// Wine Bottles
			setup(new Item(), "cork_bark"),
			setup(new Item(), "wine_cork"),
			setup(new Item(), "wine_press"),
			setup(new Item(), "wine_yeast"),
			setup(new Item(), "lead_ingot"),
			setup(new Item(), "lead_powder"),
			setup(new Item(), "iron_powder"),
			// TODO: make each wine type an enum and then turn all the hardcoded wines registration into a for loop?
			// Wine Bottles
			setup(new Item(), "wine_bottle_empty"),
			setup(new Item(), "wine_bottle_chardonnay"),
			setup(new Item(), "wine_bottle_sauvignon_blanc"),
			setup(new Item(), "wine_bottle_cabernet_sauvignon"),
			setup(new Item(), "wine_bottle_merlot"),
			setup(new Item(), "wine_bottle_pinot_noir"),
			setup(new Item(), "wine_bottle_zinfandel"),
			// Wine Glasses
			setup(new Item(), "wine_glass_empty"),
			setup(new Item(), "wine_glass_chardonnay"),
			setup(new Item(), "wine_glass_sauvignon_blanc"),
			setup(new Item(), "wine_glass_cabernet_sauvignon"),
			setup(new Item(), "wine_glass_merlot"),
			setup(new Item(), "wine_glass_pinot_noir"),
			setup(new Item(), "wine_glass_zinfandel"),
			// Grapes
			setup(new Item(), "grapes_chardonnay"),
			setup(new Item(), "grapes_sauvignon_blanc"),
			setup(new Item(), "grapes_cabernet_sauvignon"),
			setup(new Item(), "grapes_merlot"),
			setup(new Item(), "grapes_pinot_noir"),
			setup(new Item(), "grapes_zinfandel"),
			// Grape Juice
			setup(new Item(), "grape_juice_chardonnay"),
			setup(new Item(), "grape_juice_sauvignon_blanc"),
			setup(new Item(), "grape_juice_cabernet_sauvignon"),
			setup(new Item(), "grape_juice_merlot"),
			setup(new Item(), "grape_juice_pinot_noir"),
			setup(new Item(), "grape_juice_zinfandel"),
			// Grape Seeds
			setup(new Item(), "grape_seeds_chardonnay"),
			setup(new Item(), "grape_seeds_sauvignon_blanc"),
			setup(new Item(), "grape_seeds_cabernet_sauvignon"),
			setup(new Item(), "grape_seeds_merlot"),
			setup(new Item(), "grape_seeds_pinot_noir"),
			setup(new Item(), "grape_seeds_zinfandel")
		);

		ForgeRegistries.BLOCKS.getValues().stream()
		.filter(block -> block.getRegistryName().getNamespace().equals(Vinum.MODID))
		.filter(EventSubscriber::hasItemBlock)
		.forEach(block -> {
				registry.register(setup(new ItemBlock(block), block.getRegistryName()));
		});

	}

	/**
	 * Helper method to determine if a block has an ItemBlock
	 */
	private static boolean hasItemBlock(@Nonnull final Block block) {
		return true; //change this to return false if the block doesn’t have an ItemBlock
	}

	/**
	 * Helper method to correctly setup a registry entry.
	 * Calls setRegistryName with the appropriate parameters
	 * If applicable also calls setTranslationKey with the appropriate parameters
	 * @return Returns the entry passed in
	 */
	@Nonnull
	public static <T extends IForgeRegistryEntry> T setup(@Nonnull final T entry, @Nonnull final String name) {
		return setup(entry, new ResourceLocation(MOD_ID, name));
	}

	/**
	 * Helper method to correctly setup a registry entry.
	 * Calls setRegistryName with the appropriate parameters
	 * If applicable also calls setTranslationKey with the appropriate parameters
	 * @return Returns the entry passed in
	 */
	@Nonnull
	public static <T extends IForgeRegistryEntry> T setup(@N﻿onnull final T entry, @Nonnull final ResourceLocation registryName) {

		Preconditions.checkNotNull(entry, "entry to setup must not be null!");
		Preconditions.checkNotNull(registryName, "registryName to assign must not be null!");

		entry.setRegistryName(registryName);
		if (entry instanceof Block) {
			((Block) entry).setTranslationKey(registryName.getDomain() + "." + registryName.getPath());
		}
		if (entry instanceof Item) {
			((Item) entry).setTranslationKey(registryName.getDomain() + "." + registryName.getPath());
		}
		return entry;
	}

}
