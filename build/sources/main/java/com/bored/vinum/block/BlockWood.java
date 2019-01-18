package com.bored.vinum.block;

import com.bored.vinum.Vinum;
import com.bored.vinum.item.ModItems;

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