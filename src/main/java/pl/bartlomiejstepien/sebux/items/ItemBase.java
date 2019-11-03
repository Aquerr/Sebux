package pl.bartlomiejstepien.sebux.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import pl.bartlomiejstepien.sebux.SebuxMod;

public class ItemBase extends Item
{
	public ItemBase(final String name)
	{
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(SebuxMod.SEBUX_TAB);
	}

	public void registerModel()
	{
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
	}
}
