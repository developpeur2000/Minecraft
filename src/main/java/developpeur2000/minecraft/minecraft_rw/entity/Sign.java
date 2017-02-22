package developpeur2000.minecraft.minecraft_rw.entity;

import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTCompoundType;
import developpeur2000.minecraft.minecraft_rw.nbt.marshal.annotations.NBTProperty;

/**
 * Base class for sign block entities.
 */
@NBTCompoundType
public class Sign extends BlockEntity {

    @NBTProperty(upperCase = true, optional = true)
    private CommandStats commandStats;

    @NBTProperty(upperCase = true, optional = true)
    private String text1;

    @NBTProperty(upperCase = true, optional = true)
    private String text2;

    @NBTProperty(upperCase = true, optional = true)
    private String text3;

    @NBTProperty(upperCase = true, optional = true)
    private String text4;

    /**
     * Constructs a new blank item (to use when loading from file)
     */
    public Sign() {
    	super("Sign");
    }

    /**
     * copy constructor
     */
    public Sign(Sign src) {
    	super(src);
    	id = "Sign";
    	commandStats = src.commandStats;
    	text1 = src.text1;
    	text2 = src.text2;
    	text3 = src.text3;
    	text4 = src.text4;
    }
    
    public CommandStats getCommandStats() {
        return commandStats;
    }

    public void setCommandStats(CommandStats commandStats) {
        this.commandStats = commandStats;
    }

    public String getText1() {
        return text1;
    }
    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }
    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }
    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }
    public void setText4(String text4) {
        this.text4 = text4;
    }
}
