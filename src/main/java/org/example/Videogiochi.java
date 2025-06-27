package org.example;

@Override
public String toString() {
    return "Videogiochi{" +
            "Piattaforma='" + Piattaforma + '\'' +
            ", DurataDiGioco=" + DurataDiGioco +
            ", genere=" + genere +
            '}';
}

public class Videogiochi extends Giochi {
    private String Piattaforma;
    private int DurataDiGioco;
    private Genere genere;

    public Videogiochi(int IdGiochi, String Titolo, int AnnoPubblicazione, double Prezzo, String Piattaforma, int DurataDiGioco, Genere genere) {
        super(IdGiochi, Titolo, AnnoPubblicazione, Prezzo);
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
}


