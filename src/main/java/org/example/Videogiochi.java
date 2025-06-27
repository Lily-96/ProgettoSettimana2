package org.example;


public class Videogiochi extends Giochi {
    private String Piattaforma;
    private int DurataDiGioco;
    private Genere genere;

    public Videogiochi(int IdGiochi, String Titolo, int AnnoPubblicazione, double Prezzo) {
        super(IdGiochi, Titolo, AnnoPubblicazione, Prezzo);
    }

    public void VideoGiochi(int IdGiochi, String Titolo, int AnnoPubblicazione, double Prezzo, String Piattaforma, int DurataDiGioco, Genere genere) {

        this.Piattaforma = Piattaforma;
        this.DurataDiGioco = DurataDiGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return Piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        Piattaforma = piattaforma;
    }

    public int getDurataDiGioco() {
        return DurataDiGioco;
    }

    public void setDurataDiGioco(int durataDiGioco) {
        DurataDiGioco = durataDiGioco;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogiochi{" +
                "Piattaforma='" + Piattaforma + '\'' +
                ", DurataDiGioco=" + DurataDiGioco +
                ", genere=" + genere +
                '}';
    }

}

