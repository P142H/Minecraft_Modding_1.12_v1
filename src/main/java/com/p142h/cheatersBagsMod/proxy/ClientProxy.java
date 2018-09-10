package com.p142h.cheatersBagsMod.proxy;


import com.p142h.cheatersBagsMod.Reference;
import com.p142h.cheatersBagsMod.blocks.ModBlocks;
import com.p142h.cheatersBagsMod.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
//        OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
//        registerModel(ModItems.itemminerbag);
    }

    public void init(FMLInitializationEvent event) {
        ModItems.registerRender();
        ModBlocks.registerRender();
        super.init(event);

    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

    }

    public void registerModel(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
