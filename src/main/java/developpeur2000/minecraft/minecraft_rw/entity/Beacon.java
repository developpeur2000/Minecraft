package developpeur2000.minecraft.minecraft_rw.entity;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;

/**
 * Base class for beacon block entities.
 */
@NBTCompoundType
public class Beacon extends BlockEntity {

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Beacon() {
    	super("Beacon");
    }

    /**
     * copy constructor
     */
    public Beacon(Beacon src) {
    	super(src);
    	id = "Beacon";
    }
    
}
