public class ObchodniDum extends Stavba {
    int pocetPokladen;
    String nazevObchodu;

    ObchodniDum(float rozmery, int pocetPodlazi, int pocetDveri, int pocetPokladen, String nazevObchodu) {
        this.rozmery = rozmery;
        this.pocetPodlazi = pocetPodlazi;
        this.pocetDveri = pocetDveri;
        this.pocetPokladen = pocetPokladen;
        this.nazevObchodu = nazevObchodu;
    }

    public float vypocetCenyDomu(){
        float cenaDomu = pocetPodlazi* (rozmery * 10000 + pocetDveri * 1000) + (pocetPokladen * 15000);
        return cenaDomu;
    }

}
