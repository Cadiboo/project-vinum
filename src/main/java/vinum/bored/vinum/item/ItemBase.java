package vinum.bored.vinum.item;

import vinum.bored.vinum.Vinum;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item {
	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(){
		Vinum.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(Vinum.creativeTab);
			return this;
	}
}