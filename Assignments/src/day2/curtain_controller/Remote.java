package day2.curtain_controller;

public class Remote {
    public void openCurtain(Curtain curtain) {
        curtain.setState(true);
    }

    public void closeCurtain(Curtain curtain) {
        curtain.setState(false);
    }
}