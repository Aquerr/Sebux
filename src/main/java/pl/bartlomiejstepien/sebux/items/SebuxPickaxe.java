package pl.bartlomiejstepien.sebux.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import pl.bartlomiejstepien.sebux.SebuxMod;

public class SebuxPickaxe extends ItemPickaxe
{
	protected SebuxPickaxe(final ToolMaterial material)
	{
		super(material);
		setRegistryName("sebux_pickaxe");
		setUnlocalizedName("sebux_pickaxe");
		setMaxDamage(2000);
		setMaxStackSize(1);
		setHarvestLevel("pickaxe", 5);
		setCreativeTab(SebuxMod.SEBUX_TAB);
	}

	public void registerModel()
	{
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
	}
}
