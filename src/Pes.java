public class Pes extends DomaciMazlicek {
    Pes(String barva, int vek, String jmeno) {
        this.barva = barva;
        this.vek = vek;
        this.jmeno = jmeno;
    }

    public void vydejZvuk() {
        System.out.println("Haf, haf!");
    }
}
