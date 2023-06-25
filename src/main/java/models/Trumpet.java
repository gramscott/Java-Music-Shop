package models;

public class Trumpet extends Instrument {

    private Integer valves;

    public Trumpet(Integer valves){
        this.valves = valves;
    }

    public String play() {
        return "Trumpet plays";
    }

    public Integer getValves() {
        return valves;
    }

    public void setValves(Integer valves) {
        this.valves = valves;
    }
}
