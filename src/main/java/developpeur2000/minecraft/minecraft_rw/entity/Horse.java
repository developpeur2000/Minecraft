package developpeur2000.minecraft.minecraft_rw.entity;

import java.util.ArrayList;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for horse entities.
 */
@NBTCompoundType
public class Horse extends EntityHorse {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Horse() {
    	super("Horse");
	}

    /**
     * copy constructor
     */
    public Horse(Horse src) {
    	super(src);
    	id = "Horse";
	}
}
