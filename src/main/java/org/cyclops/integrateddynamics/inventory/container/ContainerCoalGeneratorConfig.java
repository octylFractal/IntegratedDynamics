package org.cyclops.integrateddynamics.inventory.container;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.cyclops.cyclopscore.client.gui.ScreenFactorySafe;
import org.cyclops.cyclopscore.config.extendedconfig.GuiConfig;
import org.cyclops.integrateddynamics.IntegratedDynamics;
import org.cyclops.integrateddynamics.client.gui.container.ContainerScreenCoalGenerator;

/**
 * Config for {@link ContainerCoalGenerator}.
 * @author rubensworks
 */
public class ContainerCoalGeneratorConfig extends GuiConfig<ContainerCoalGenerator> {

    public ContainerCoalGeneratorConfig() {
        super(IntegratedDynamics._instance,
                "coal_generator",
                eConfig -> new MenuType<>(ContainerCoalGenerator::new));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public <U extends Screen & MenuAccess<ContainerCoalGenerator>> MenuScreens.ScreenConstructor<ContainerCoalGenerator, U> getScreenFactory() {
        return new ScreenFactorySafe<>(ContainerScreenCoalGenerator::new);
    }

}
