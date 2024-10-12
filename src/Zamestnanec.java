public class Zamestnanec {
    private boolean jeZena;
    private String pracovniPozice;
    private int id;
    private int delkaZamPomeru;

    Zamestnanec(boolean jeZena, String pracovniPozice, int id, int delkaZamPomeru) {
        this.jeZena = jeZena;
        this.pracovniPozice = pracovniPozice;
        this.id = id;
        this.delkaZamPomeru = delkaZamPomeru;
    }

}
