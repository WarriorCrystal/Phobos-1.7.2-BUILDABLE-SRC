package me.earth.phobos.manager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.earth.phobos.features.modules.client.Cosmetics;
import me.earth.phobos.util.Util;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;

public class CosmeticsManager
implements Util {
    public Map<String, List<ModelBase>> cosmeticsUserMap = new HashMap<String, List<ModelBase>>();

    public CosmeticsManager() {
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.santaHatModel, Cosmetics.INSTANCE.glassesModel}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.cloutGoggles}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.cloutGoggles}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.flag, Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.flag, Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.flag, Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("d63d84ae-d45d-4d01-a765-26b8e560c0a8", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.glassesModel, Cosmetics.INSTANCE.squidLauncher}));
    }

    public List<ModelBase> getRenderModels(EntityPlayer player) {
        return this.cosmeticsUserMap.get(player.getUniqueID().toString());
    }

    public boolean hasCosmetics(EntityPlayer player) {
        return this.cosmeticsUserMap.containsKey(player.getUniqueID().toString());
    }
}

