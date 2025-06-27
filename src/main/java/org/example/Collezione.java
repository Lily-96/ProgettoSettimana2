package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Collezione {
    private Map<Integer, Giochi> giochi = new HashMap<>();

    public boolean aggiungiGioco(Giochi gioco) {
        if (giochi.containsKey(gioco.getIdGioco())) {
            return false;
        }
        giochi.put(gioco.getIdGioco(), gioco);
        return true;
    }

    //Rimuovi gioco
    public boolean rimuoviGioco(int id) {
        return giochi.remove(id) != null;
    }

    //Cerca Id

    public Optional<Giochi> cercaPerId(int id) {
        return Optional.ofNullable(giochi.get(id));
    }

    //Cerca per prezzo
    public List<Giochi> cercaPerPrezzo(double maxPrezzo) {
        return giochi.values().stream().filter(g -> g.getPrezzo() < maxPrezzo).collect(Collectors.toList());
    }
}
