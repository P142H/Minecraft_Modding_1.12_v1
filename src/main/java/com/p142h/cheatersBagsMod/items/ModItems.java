package com.p142h.cheatersBagsMod.items;

import com.p142h.cheatersBagsMod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

    public static Item itemminerbag;

    public static void init() {
        itemminerbag  = new ItemMinerBag(1);
    }

    public static void register() {
        setRegister(itemminerbag);
    }

    public static void registerRender() {
        setRender(itemminerbag);
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":"+item.getUnlocalizedName().substring(5), "inventory"));
    }
}
