package me.jellysquid.mods.lithium.common.shapes;

import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;

/**
 * Provides a simple interface for directly querying intersections against a shape. This can be used instead of the
 * expensive {@link net.minecraft.util.shape.VoxelShapes#matchesAnywhere(VoxelShape, VoxelShape, BooleanBiFunction)}
 * in collision detection and resolution.
 */
public interface VoxelShapeExtended {
    /**
     * Checks whether an entity's bounding box collides with this shape translated to the given coordinates.
     *
     * @param box The entity's bounding box
     * @param x   The x-coordinate of this shape
     * @param y   The y-coordinate of this shape
     * @param z   The z-coordinate of this shape
     * @return True if the box intersects with this shape, otherwise false
     */
    boolean intersects(Box box, double x, double y, double z);
}
