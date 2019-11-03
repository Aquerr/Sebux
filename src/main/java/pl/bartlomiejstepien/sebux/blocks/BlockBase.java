package pl.bartlomiejstepien.sebux.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import pl.bartlomiejstepien.sebux.SebuxMod;

public class BlockBase extends Block
{
	public BlockBase(final String name, final Material material)
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(SebuxMod.SEBUX_TAB);
	}

	public void registerModel()
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
	}
}
