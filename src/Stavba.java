abstract class Stavba {
    protected int pocetDveri;
    protected float rozmery;
    protected int pocetPodlazi;

    protected float vypocetCenyDomu(){
        float cenaDomu = pocetPodlazi* (rozmery * 10000 + pocetDveri * 1000);
        return cenaDomu;
    }

}
