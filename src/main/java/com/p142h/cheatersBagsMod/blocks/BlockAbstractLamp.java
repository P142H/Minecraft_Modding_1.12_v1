package com.p142h.cheatersBagsMod.blocks;

import com.p142h.cheatersBagsMod.CheatersBagsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAbstractLamp extends Block {
    public BlockAbstractLamp() {
        super(Material.GLASS);
        setCreativeTab(CheatersBagsMod.cheatersBagPack);
        setLightLevel(0.9F);
    }
}
