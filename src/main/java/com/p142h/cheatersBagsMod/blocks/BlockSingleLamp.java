package com.p142h.cheatersBagsMod.blocks;

import com.p142h.cheatersBagsMod.CheatersBagsMod;
import com.p142h.cheatersBagsMod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSingleLamp extends Block {
    public BlockSingleLamp() {
        super(Material.GLASS);
        setUnlocalizedName(Reference.CheatersBagBlocks.SINGLE_LAMP.getUnlocalizedName());
        setRegistryName(Reference.CheatersBagBlocks.SINGLE_LAMP.getRegistryName());
        setCreativeTab(CheatersBagsMod.cheatersBagPack);
        setLightLevel(0.9F);
    }
}
