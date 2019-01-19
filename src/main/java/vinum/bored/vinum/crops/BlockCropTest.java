package vinum.bored.vinum.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import vinum.bored.vinum.item.ModItems;

public class BlockCropTest extends BlockCrops {

	public BlockCropTest() {
		setUnlocalizedName("blockcoke");
		setRegistryName("blockcoke");
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.bituminouscoal;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.coke;
	}

}