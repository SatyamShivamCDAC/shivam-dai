package day2.curtain_controller;

public class Controller {
    public static void main(String[] args) {
        Curtain curtain1 = new Curtain();
        Remote remote = new Remote();

        System.out.println(curtain1);

        remote.openCurtain(curtain1);

        System.out.println(curtain1);

        remote.closeCurtain(curtain1);

        System.out.println(curtain1);
    }
}
