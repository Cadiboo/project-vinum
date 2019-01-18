package com.bored.vinum.block;

import java.util.Random;

import com.bored.vinum.Vinum;
import com.bored.vinum.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase {
	
	public BlockOre(String name){
		super(Material.ROCK, name);
		
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(Vinum.creativeTab);
		return this;
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.coke;
}

}