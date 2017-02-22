package developpeur2000.minecraft.minecraft_rw.entity;

import java.util.ArrayList;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for donkey entities.
 */
@NBTCompoundType
public class Donkey extends EntityHorse {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Donkey() {
    	super("Donkey");
	}

    /**
     * copy constructor
     */
    public Donkey(Donkey src) {
    	super(src);
    	id = "Donkey";
	}
}
