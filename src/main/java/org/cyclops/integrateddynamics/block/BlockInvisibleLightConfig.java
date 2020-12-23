package org.cyclops.integrateddynamics.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.config.ModConfig;
import org.cyclops.cyclopscore.config.ConfigurableProperty;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;
import org.cyclops.integrateddynamics.IntegratedDynamics;

/**
 * Config for {@link BlockInvisibleLight}.
 * @author rubensworks
 */
public class BlockInvisibleLightConfig extends BlockConfig {

    @ConfigurableProperty(category = "machine", comment = "If invisible light should act as full a block", configLocation = ModConfig.Type.SERVER)
    public static boolean invisibleLightBlock = true;

    public BlockInvisibleLightConfig() {
        super(
                IntegratedDynamics._instance,
                "invisible_light",
                eConfig -> new BlockInvisibleLight(Block.Properties.create(Material.AIR)
                        .hardnessAndResistance(3.0F)
                        .sound(SoundType.METAL)
                        .setLightLevel((blockState) -> 15)),
                getDefaultItemConstructor(IntegratedDynamics._instance)
        );
    }

}
