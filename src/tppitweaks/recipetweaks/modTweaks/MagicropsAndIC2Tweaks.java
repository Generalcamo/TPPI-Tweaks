package tppitweaks.recipetweaks.modTweaks;

import net.minecraft.item.ItemStack;

public class MagicropsAndIC2Tweaks
{
	public static void addRecipes()
	{
		ic2.core.block.machine.tileentity.TileEntityMacerator.addRecipe("oreMCropsEssence", 1, new ItemStack(magicalcrops.mod_mCrops.MagicEssence, 8, 0));
		ic2.core.block.machine.tileentity.TileEntityMacerator.addRecipe("oreMCropsNetherEssence", 1, new ItemStack(magicalcrops.mod_mCrops.MagicEssence, 12, 0));
	}
}
