package pl.bartlomiejstepien.sebux.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.bartlomiejstepien.sebux.items.ModItems;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.SEBUX_DUST, new ItemStack(ModItems.SEBUX_INGOT, 1), 1.5f);
	}
}
