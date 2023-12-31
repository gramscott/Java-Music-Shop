package models;

public class Guitar extends Instrument {

    private Integer strings;

    public Guitar(Integer strings){
        super("White", "Wood", "Acoustic", "String");
        this.strings = strings;
    }
    public String play() {
        return "Guitar plays";
    }

    public Integer getStrings() {
        return strings;
    }

    public void setStrings(Integer strings) {
        this.strings = strings;
    }


}
