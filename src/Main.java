import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Toto je zmena!!!!


        RodinnyDum dumNovakovych = new RodinnyDum(185.5f,3,4, true,"Adresa1");
        float cenaNovaku = dumNovakovych.vypocetCenyDomu();
        System.out.println("Cena domu Novaku: " + cenaNovaku);

        RodinnyDum dumZajicovych = new RodinnyDum(285.3f,2,2, false,"Adresa2");
        float cenaZajicu = dumZajicovych.vypocetCenyDomu();
        System.out.println("Cena domu Zajicu: " + cenaZajicu);

        ObchodniDum globus = new ObchodniDum(800, 4, 20, 15, "Globus");
        System.out.println("Cena obchodniho domu Globus: " + globus.vypocetCenyDomu());


        /////////////////////////////////////////////////////////
        Kocka mourek = new Kocka("Hneda", 5, "Mourek");
        Kocka koki = new Kocka("Bila", 3, "Koki");
        koki.vydejZvuk();

        Pes alik = new Pes("Seda", 8, "Alik");
        alik.vydejZvuk();
        /////////////////////////////////////////////////////////
        Zamestnanec jana = new Zamestnanec(true, "Manazerka", 0, 7);
        Zamestnanec petr = new Zamestnanec(false, "Vyvojar", 1, 2);
        Zamestnanec katka = new Zamestnanec(true, "Tester", 2, 4);
        /////////////////////////////////////////////////////////

    }
}