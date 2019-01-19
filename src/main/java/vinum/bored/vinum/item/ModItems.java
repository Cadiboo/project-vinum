package vinum.bored.vinum.item;

import vinum.bored.vinum.Vinum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase coke = new ItemBase("coke").setCreativeTab(Vinum.creativeTab);
	public static ItemBase bituminouscoal = new ItemBase("bituminouscoal").setCreativeTab(Vinum.creativeTab);
	//public static ItemBase canOfSlimoline = new ItemBase("can_of_slimoline").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase compressedPelletFuel = new ItemBase("compressed_pellet_fuel").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase coalDust = new ItemBase("coal_dust").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase glassOrb = new ItemBase("glass_orb").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase temperedGlassOrb = new ItemBase("tempered_glass_orb").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase lavaGlassOrb = new ItemBase("lava_glass_orb").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase lavaCrystals = new ItemBase("lava_crystals").setCreativeTab(MoreFuelsMod.creativeTab);
	//public static ItemBase pelletFuel = new ItemBase("pellet_fuel").setCreativeTab(MoreFuelsMod.creativeTab);
	
	public static void register (IForgeRegistry<Item> registry) {
		registry.registerAll(
				coke,
				bituminouscoal
				//canOfSlimoline,
				//compressedPelletFuel,
				//coalDust,
				//glassOrb,
				//temperedGlassOrb,
				//lavaGlassOrb,
				//lavaCrystals,
				//pelletFuel
	);
	}
	
	public static void registerModels() {
		coke.registerItemModel();
		bituminouscoal.registerItemModel();
		//canOfSlimoline.registerItemModel();
		//compressedPelletFuel.registerItemModel();
		//coalDust.registerItemModel();
		//glassOrb.registerItemModel();
		//temperedGlassOrb.registerItemModel();
		//lavaGlassOrb.registerItemModel();
		//lavaCrystals.registerItemModel();
		//pelletFuel.registerItemModel();
	}
}