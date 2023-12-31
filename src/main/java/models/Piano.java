package models;

public class Piano extends Instrument  {

    private Integer keys;

    public Piano(Integer keys){
        super("Black", "Wood", "Grand Piano", "Keyboard");
        this.keys = keys;
    }

    public String play() {
        return "Piano plays";
    }

    public Integer getKeys() {
        return keys;
    }

    public void setKeys(Integer keys) {
        this.keys = keys;
    }
}
