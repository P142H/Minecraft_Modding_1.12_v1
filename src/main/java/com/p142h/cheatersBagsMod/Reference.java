package com.p142h.cheatersBagsMod;

public class Reference {


    public static final String MOD_ID = "cbm";
    public static final String NAME = "Mod with very big bags and maybe new lamps";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_VERSION = "[1.12.2]";

    public static final String CLIENT_PROXY_CLASS = "com.p142h.cheatersBagsMod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.p142h.cheatersBagsMod.proxy.ServerProxy";

    public static enum CheatersBagItem {
        MINERBAG("itemminerbag", "ItemMinerBag");

        private String unlocalizedName;

        private String registryName;

        CheatersBagItem(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
