package com.p142h.cheatersBagsMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

    public static Block blocksinglelamp;
    public static Block blockdoublelamp;
    public static Block blocktriplelamp;

    public static void init() {
        blocksinglelamp = new BlockSingleLamp();
        blockdoublelamp = new BlockDoubleLamp();
        blocktriplelamp = new BlockTripleLamp();
    }

    public static void register() {
        registerBlock(blocksinglelamp);
        registerBlock(blockdoublelamp);
        registerBlock(blocktriplelamp);
    }

    public static void registerRender() {
        setRender(blocksinglelamp);
        setRender(blockdoublelamp);
        setRender(blocktriplelamp);
    }

    private static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);
    }

    private static void setRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
