package it.unibs.elabingesw.service;

import it.unibs.elabingesw.businesslogic.categoria.Campo;
import it.unibs.eliapitozzi.mylib.InputDati;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe CampoService contenente due metodi statici appositi 
 * per gestire le richieste dell'utente di aggiungere nuovi
 * campi alle categorie.
 *
 * @author Elia Pitozzi
 * @author Ali Laaraj
 */
public class CampoService {
    
    /**
     * Metodo statico che ritorna la lista dei campi che
     * l'utente inserisce nell'applicativo.
     *
     * @return la lista dei campi inseriti dall'utente
     * @see campo
     */
    public static List<Campo> chiediListaDiCampi() {
        List<Campo> campi = new ArrayList<>();
        if (InputDati.yesOrNo("Inserire un campo?")) {
            campi.add(chiediNuovoCampo());

            while (InputDati.yesOrNo("Inserire un nuovo campo?")) {
                campi.add(chiediNuovoCampo());
            }
        }
        return campi;
    }
    
    /**
     *  Metodo statico che chiede all'utente di inserire
     *  un nuovo campo. Ritorna il nuovo campo.
     *  <p>
     *  Devono essere inseriti il nome del nuovo campo e
     *  se quest'ultimo è obbligatorio oppure no.
     *
     * @return un nuovo campo
     * @see Campo
     */
    private static Campo chiediNuovoCampo() {
        String nome = InputDati.leggiStringaNonVuota("Inserisci il nome del campo: ");
        boolean obbligatorio = InputDati.yesOrNo("È obbligatorio?");

        return new Campo(nome, obbligatorio);
    }

}
