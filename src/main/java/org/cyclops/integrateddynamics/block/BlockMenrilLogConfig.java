package org.cyclops.integrateddynamics.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MaterialColor;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;
import org.cyclops.cyclopscore.helper.BlockHelpers;
import org.cyclops.integrateddynamics.IntegratedDynamics;

/**
 * Config for the Menril Log.
 * @author rubensworks
 *
 */
public class BlockMenrilLogConfig extends BlockConfig {

    public BlockMenrilLogConfig() {
        super(
                IntegratedDynamics._instance,
                "menril_log",
                eConfig -> Blocks.log(MaterialColor.COLOR_CYAN, MaterialColor.COLOR_CYAN),
                getDefaultItemConstructor(IntegratedDynamics._instance)
        );
    }

    @Override
    public void onForgeRegistered() {
        super.onForgeRegistered();
        BlockHelpers.setFireInfo(getInstance(), 5, 20);
    }
}
