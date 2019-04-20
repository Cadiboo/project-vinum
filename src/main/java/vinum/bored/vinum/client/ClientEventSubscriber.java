package vinum.bored.vinum.client;

import vinum.bored.vinum.Vinum;

import com.google.common.base.Preconditions;
import io.github.cadiboo.examplemod.util.ModReference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * Subscribe to events that should be handled on the PHYSICAL CLIENT in this class
 */
@Mod.EventBusSubscriber(modid = Vinum.MODID, value = CLIENT)
public final class ClientEventSubscriber {

	/**
	 * This method will be called by Forge when it is time for the mod to register its models.
	 * This method will always be called after the block and item registry methods.
	 */
	@SubscribeEvent
	public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
		ForgeRegistries.ITEMS.getValues().stream()
		.filter(item -> item.getRegistryName().getNamespace().equals(Vinum.MODID))
		.forEach(item -> {
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal"));
		});

	}

}
