package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Collezione {
    private Map<Integer, Giochi> giochi = new HashMap<>();

    public boolean aggiungiGioco(Giochi gioco) {
        if (giochi.containsKey(gioco.getIdGioco())) {
            return false;
        }
        giochi.put(gioco.getIdGioco(), gioco);
        return true;
    }
    //Cerca Id

    public Optional<Giochi> cercaPerId(int id) {
        return Optional.ofNullable(giochi.get(id));
    }
}
