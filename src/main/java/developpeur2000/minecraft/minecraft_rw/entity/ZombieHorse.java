package developpeur2000.minecraft.minecraft_rw.entity;

import java.util.ArrayList;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for zombie horse entities.
 */
@NBTCompoundType
public class ZombieHorse extends EntityHorse {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public ZombieHorse() {
    	super("ZombieHorse");
	}

    /**
     * copy constructor
     */
    public ZombieHorse(ZombieHorse src) {
    	super(src);
    	id = "ZombieHorse";
	}
}
