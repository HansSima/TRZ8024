public class RodinnyDum extends Stavba {
    private boolean maSikmouStrechu;
    private String adresa;

    RodinnyDum(float rozmery, int pocetPodlazi, int pocetDveri, boolean maSikmouStrechu, String adresa) {
        this.rozmery = rozmery;
        this.pocetPodlazi = pocetPodlazi;
        this.pocetDveri = pocetDveri;
        this.maSikmouStrechu = maSikmouStrechu;
        this.adresa = adresa;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }



}
