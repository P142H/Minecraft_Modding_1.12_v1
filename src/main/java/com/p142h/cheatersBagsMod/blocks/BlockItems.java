package com.p142h.cheatersBagsMod.blocks;

import net.minecraft.block.Block;

public class BlockItems {

    public static Block singleLampBlock;

    public static void init() {
        singleLampBlock  = new BlockLamp(1);
    }

//    public static void register() {
//        singleLampBlock    }
//
//    public static void registerRender() {
//        setRender(singleLampBlock);
//    }
//
//    private static void setRegister(Block item) {
//        singleLampBlock.BLOCKS.
//                //BLOC.register(item);
//    }
//
//    private static void setRender(Item item) {
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":"+item.getUnlocalizedName().substring(5), "inventory"));
//    }
}
