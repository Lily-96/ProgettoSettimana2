package org.example;

public class GiochiDaTavola extends Giochi {
    private int NumeroDiGiocatori;
    private int DurataMediaDiUnaPartita;

    public GiochiDaTavola(int IdGiochi, String Titolo, int AnnoPubblicazione, double Prezzo, int NumeroDiGiocatori, int DurataMediaDiUnaPartita) {
        super(IdGiochi, Titolo, AnnoPubblicazione, Prezzo);
        if (NumeroDiGiocatori < 2 || NumeroDiGiocatori > 10) {
            System.out.println("Il numero di giocatori è giusto ");
        } else {
            System.out.println("Il numero di giocatori deve essere compreso tra 2 e 10");
        }
        this.NumeroDiGiocatori = NumeroDiGiocatori;
        this.DurataMediaDiUnaPartita = DurataMediaDiUnaPartita;
    }

    public int getNumeroDiGiocatori() {
        return NumeroDiGiocatori;
    }

    public void setNumeroDiGiocatori(int numeroDiGiocatori) {
        NumeroDiGiocatori = numeroDiGiocatori;
    }

    public int getDurataMediaDiUnaPartita() {
        return DurataMediaDiUnaPartita;
    }

    public void setDurataMediaDiUnaPartita(int durataMediaDiUnaPartita) {
        DurataMediaDiUnaPartita = durataMediaDiUnaPartita;
    }

    @Override
    public String toString() {
        return "GiochiDaTavola{" +
                "NumeroDiGiocatori=" + NumeroDiGiocatori +
                ", DurataMediaDiUnaPartita=" + DurataMediaDiUnaPartita +
                '}';
    }
}
