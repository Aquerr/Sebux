package pl.bartlomiejstepien.sebux.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

public class ModItems
{
	public static final SebuxDust SEBUX_DUST = new SebuxDust("sebux_dust");
	public static final SebuxIngot SEBUX_INGOT = new SebuxIngot("sebux_ingot");
	public static final SebuxPickaxe SEBUX_PICKAXE = new SebuxPickaxe(Item.ToolMaterial.DIAMOND);

	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(SEBUX_DUST);
		event.getRegistry().register(SEBUX_INGOT);
		event.getRegistry().register(SEBUX_PICKAXE);
	}

	public static void registerModels(ModelRegistryEvent event)
	{
		SEBUX_DUST.registerModel();
		SEBUX_INGOT.registerModel();
		SEBUX_PICKAXE.registerModel();
	}
}
