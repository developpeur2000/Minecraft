package developpeur2000.minecraft.minecraft_rw.entity;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for flower pot block entities.
 */
@NBTCompoundType
public class FlowerPot extends BlockEntity {

    @NBTProperty(upperCase = true)
    private String item;

    @NBTProperty(upperCase = true)
    private int data;

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public FlowerPot() {
    	super("FlowerPot");
    }

    /**
     * copy constructor
     */
    public FlowerPot(FlowerPot src) {
    	super(src);
    	id = "FlowerPot";
    	item = src.item;
    	data = src.data;
    }
    
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

}
