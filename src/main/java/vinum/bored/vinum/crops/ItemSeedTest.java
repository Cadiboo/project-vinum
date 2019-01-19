package vinum.bored.vinum.crops;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import vinum.bored.vinum.Vinum;
import vinum.bored.vinum.block.ModBlocks;

public class ItemSeedTest extends ItemSeeds {

	public ItemSeedTest() {
		super(ModBlocks.blockcoke, Blocks.FARMLAND);
		setUnlocalizedName("bituminouscoal");
		setRegistryName("bituminouscoal");
	}
	
	public void registerItemModel(Item item) {
	 Vinum.proxy.registerItemRenderer(item, 0, "bituminouscoal");
	}

}