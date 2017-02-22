package developpeur2000.minecraft.minecraft_rw.entity;

import java.util.ArrayList;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;

/**
 * Base class for mule entities.
 */
@NBTCompoundType
public class Mule extends EntityHorse {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Mule() {
    	super("Mule");
	}

    /**
     * copy constructor
     */
    public Mule(Mule src) {
    	super(src);
    	id = "Mule";
	}
}
