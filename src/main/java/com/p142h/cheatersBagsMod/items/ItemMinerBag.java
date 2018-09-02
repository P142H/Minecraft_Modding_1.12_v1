package com.p142h.cheatersBagsMod.items;

import com.p142h.cheatersBagsMod.CheatersBagsMod;
import com.p142h.cheatersBagsMod.Reference;
import net.minecraft.item.Item;

public class ItemMinerBag extends Item {
    public ItemMinerBag(int maxStackSize) {
        setFull3D();
        setMaxStackSize(maxStackSize);
        setUnlocalizedName(Reference.CheatersBagItem.MINER_BAG.getUnlocalizedName());
        setRegistryName(Reference.CheatersBagItem.MINER_BAG.getRegistryName());
        setCreativeTab(CheatersBagsMod.cheatersBagPack);
    }
}
