package com.p142h.cheatersBagsMod.items;

import com.p142h.cheatersBagsMod.CheatersBagsMod;
import com.p142h.cheatersBagsMod.Reference;
import net.minecraft.item.Item;

public class ItemMinerBag extends Item {
    public ItemMinerBag(int maxStackSize) {
        this.setFull3D();
        this.setMaxStackSize(maxStackSize);
        this.setUnlocalizedName(Reference.CheatersBagItem.MINERBAG.getUnlocalizedName());
        this.setRegistryName(Reference.CheatersBagItem.MINERBAG.getRegistryName());
        this.setCreativeTab(CheatersBagsMod.cheatersBagPack);
    }
}
