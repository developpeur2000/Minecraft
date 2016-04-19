package de.pdinklag.minecraft.entity;

import de.pdinklag.minecraft.nbt.marshal.annotations.NBTCompoundType;
import de.pdinklag.minecraft.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for pigs.
 */
@NBTCompoundType
public class Chicken extends BreedableMob {
    @NBTProperty(upperCase = true)
    private boolean isChickenJockey;

    @NBTProperty(upperCase = true)
    private int eggLayTime;


    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Chicken() {
    	super("Chicken");
    	isChickenJockey = false;
    	eggLayTime = (int) ((1 + Math.random()) * 6000);
    }

    /**
     * copy constructor
     */
    public Chicken(Chicken src) {
    	super(src);
    	id = "Chicken";
    	isChickenJockey = src.isChickenJockey;
    	eggLayTime = src.eggLayTime;
    }
    
    public boolean getIsChickenJockey() {
        return isChickenJockey;
    }

    public void setIsChickenJockey(boolean isChickenJockey) {
        this.isChickenJockey = isChickenJockey;
    }

    public int getEggLayTime() {
        return eggLayTime;
    }

    public void setEggLayTime(int eggLayTime) {
        this.eggLayTime = eggLayTime;
    }
}