package models;

import interfaces.IPlay;

public abstract class Instrument extends Shop implements IPlay {

    String colour;
    String material;
    String type;
    String category;

    public Instrument(String colour, String material, String type, String category){
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.category = category;
    }
}
