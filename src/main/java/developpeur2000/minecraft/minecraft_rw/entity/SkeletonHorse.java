package developpeur2000.minecraft.minecraft_rw.entity;

import java.util.ArrayList;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for skeleton horse entities.
 */
@NBTCompoundType
public class SkeletonHorse extends EntityHorse {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public SkeletonHorse() {
    	super("SkeletonHorse");
	}

    /**
     * copy constructor
     */
    public SkeletonHorse(SkeletonHorse src) {
    	super(src);
    	id = "SkeletonHorse";
	}
}
