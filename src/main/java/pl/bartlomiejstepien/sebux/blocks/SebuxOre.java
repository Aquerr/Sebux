package pl.bartlomiejstepien.sebux.blocks;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import pl.bartlomiejstepien.sebux.items.ModItems;

import java.util.Random;

public class SebuxOre extends BlockBase
{
	public SebuxOre(final String name, final Material material)
	{
		super(name, material);
		setResistance(5.0f);
		setHardness(5.0f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 3);
	}

	@Override
	@MethodsReturnNonnullByDefault
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.SEBUX_DUST;
	}

	@Override
	public int quantityDropped(Random random)
	{
		return 1 + random.nextInt(2);
	}
}
