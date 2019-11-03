package pl.bartlomiejstepien.sebux;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pl.bartlomiejstepien.sebux.blocks.ModBlocks;
import pl.bartlomiejstepien.sebux.items.ModItems;
import pl.bartlomiejstepien.sebux.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import pl.bartlomiejstepien.sebux.recipes.ModRecipes;

@Mod(modid = SebuxMod.MODID, name = SebuxMod.NAME, version = SebuxMod.VERSION)
public class SebuxMod
{
    public static final String MODID = "sebux";
    public static final String NAME = "Sebux";
    public static final String VERSION = "1.0";

    public static final String CLIENT_PROXY = "pl.bartlomiejstepien.sebux.proxy.ClientProxy";
    public static final String COMMON_PROXY = "pl.bartlomiejstepien.sebux.proxy.CommonProxy";

    private static Logger logger;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy PROXY;

    @Mod.Instance
    private static SebuxMod instance;


    public static final CreativeTabs SEBUX_TAB = new CreativeTabs("sebux")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.SEBUX_ORE);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        PROXY.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        PROXY.init(event);
        ModRecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        PROXY.postInit(event);
    }

    @Mod.EventBusSubscriber
    public static class RegistryHandler
    {
        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> event)
        {
            ModBlocks.registerBlocks(event);
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> event)
        {
            ModBlocks.registerBlocksItems(event);
            ModItems.registerItems(event);
        }

        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public static void onModelRegister(ModelRegistryEvent event)
        {
            ModBlocks.registerModels(event);
            ModItems.registerModels(event);
        }
    }
}
