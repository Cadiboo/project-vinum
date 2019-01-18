package vinum.bored.vinum.block;

import vinum.bored.vinum.Vinum;
import vinum.bored.vinum.item.ItemBase;
import vinum.bored.vinum.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStone extends BlockBase {
	
	public BlockStone(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(Vinum.creativeTab);
		return this;
	}
}