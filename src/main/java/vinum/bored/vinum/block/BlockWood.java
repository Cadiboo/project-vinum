package vinum.bored.vinum.block;

import vinum.bored.vinum.Vinum;
import vinum.bored.vinum.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWood extends BlockBase {
	
	public BlockWood(String name){
		super(Material.WOOD, name);
		setHardness(2f);
		setResistance(3f);
	}
	
	@Override
	public BlockWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(Vinum.creativeTab);
		return this;
	}
}