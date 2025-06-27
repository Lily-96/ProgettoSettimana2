package org.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Collezione collezione = new Collezione();
        Scanner print = new Scanner(System.in);
        boolean vediamo = true;
        while (vediamo) {
            System.out.println("Scegli: ");
            System.out.println("1: Aggiungi gioco");
            System.out.println("2: Cerca per ID");
            System.out.println("3: Cerca per prezzo");
            System.out.println("4: Rimuovi gioco");
            System.out.println("0: Esci");
            String scegli = print.nextLine();

            switch (scegli) {
                case "1":
                    System.out.println("ID: ");
                    int IdGioco = Integer.parseInt(print.nextLine());
                    System.out.println("Titolo: ");
                    String Titolo = print.nextLine();
                    System.out.println("Anno: ");
                    int AnnoPubblicazione = Integer.parseInt(print.nextLine());
                    System.out.println("Prezzo: ");
                    double Prezzo = Double.parseDouble(print.nextLine());
            }

        }
    }
}
