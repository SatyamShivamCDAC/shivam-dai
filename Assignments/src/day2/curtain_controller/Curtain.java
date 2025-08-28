package day2.curtain_controller;

public class Curtain {
    private boolean state;

    public Curtain() {
        state = false;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public String toString() {
        return (state) ? "Curtain is Open" : "Curtain is Closed";
    }
}