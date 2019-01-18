
package com.bored.vinum.ui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.bored.vinum.Vinum;
import com.bored.vinum.item.ModItems;

public class VinumTab extends CreativeTabs{
	
	public VinumTab() {
		super(Vinum.modid);
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.coke);
	}
	@Override
	public boolean hasSearchBar(){
		return true;
	}
}