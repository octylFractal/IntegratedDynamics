package org.cyclops.integrateddynamics.core.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Interface used to access the parent methods from a {@link ICollidable}.
 * @author rubensworks
 */
public interface ICollidableParent {

    /**
     * Simply forward this call to the super.
     * @param state The block state
     * @param worldIn The world
     * @param pos The position
     * @param mask The bounding boxes mask
     * @param list The list to add to
     * @param collidingEntity The entity that is colliding
     */
    public void addCollisionBoxesToListParent(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB mask,
                                               List<AxisAlignedBB> list, Entity collidingEntity);

    /**
     * Simply forward this call to the super.
     * @param blockState The block state
     * @param worldIn The world
     * @param pos The position
     * @return The selected bounding box
     */
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxParent(IBlockState blockState, World worldIn, BlockPos pos);

    /**
     * Simply forward this call to the super.
     * @param blockState The block state
     * @param world The world
     * @param pos The position
     * @param origin The origin vector
     * @param direction The direction vector
     * @return The position object holder
     */
    public RayTraceResult collisionRayTraceParent(IBlockState blockState, World world, BlockPos pos, Vec3d origin, Vec3d direction);

}
