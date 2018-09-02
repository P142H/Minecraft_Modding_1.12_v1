package com.p142h.cheatersBagsMod.proxy;


import com.p142h.cheatersBagsMod.blocks.ModBlocks;
import com.p142h.cheatersBagsMod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        ModItems.registerRender();
        ModBlocks.registerRender();
        super.init(event);

    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

    }
}
