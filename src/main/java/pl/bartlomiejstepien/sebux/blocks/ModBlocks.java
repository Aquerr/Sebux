package pl.bartlomiejstepien.sebux.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
	public static final SebuxOre SEBUX_ORE = new SebuxOre("sebux_ore", Material.ROCK);

	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(SEBUX_ORE);
	}

	public static void registerBlocksItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemBlock(SEBUX_ORE).setRegistryName(SEBUX_ORE.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event)
	{
		SEBUX_ORE.registerModel();
	}
}
