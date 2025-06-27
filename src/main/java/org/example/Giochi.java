package org.example;

public abstract class Giochi {
    private int IdGioco;
    private String Titolo;
    private int AnnoPubblicazione;
    private double Prezzo;

    public Giochi(int IdGiochi, String Titolo, int AnnoPubblicazione, double Prezzo) {
        this.IdGioco = IdGiochi;
        this.Titolo = Titolo;
        this.AnnoPubblicazione = AnnoPubblicazione;
        this.Prezzo = Prezzo;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public int getIdGioco() {
        return IdGioco;
    }

    public void setIdGioco(int idGioco) {
        IdGioco = idGioco;
    }

    public int getAnnoPubblicazione() {
        return AnnoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        AnnoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return Prezzo;
    }

    public void setPrezzo(double prezzo) {
        Prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Giochi{" +
                "IdGioco=" + IdGioco +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoPubblicazione=" + AnnoPubblicazione +
                ", Prezzo=" + Prezzo +
                '}';
    }
}
