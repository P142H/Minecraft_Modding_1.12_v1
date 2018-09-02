package com.p142h.cheatersBagsMod;

import com.p142h.cheatersBagsMod.creativetabs.TabMain;
import com.p142h.cheatersBagsMod.items.ModItems;
import com.p142h.cheatersBagsMod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class CheatersBagsMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();
        //proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static CreativeTabs cheatersBagPack = new TabMain("cheatersBagPack");

//    private static CreativeTabs cheatersBagPack = new CreativeTabs("com/p142h/cheatersBagPack") {
//        @Override
//        public Item getTabIconItem() {
//            return new ItemStack(itemMinerBag).getItem();
//        }
//    };

}
