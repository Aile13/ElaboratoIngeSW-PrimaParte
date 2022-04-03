package it.unibs.elabingesw.businesslogic.categoria;

import java.io.Serializable;
import java.util.List;

/**
 * Classe Campo che definisce un campo di una determinata categoria.
 * 
 * @author Elia Pitozzi
 * @author Ali Laaraj
 */
public final class Campo implements Serializable {
    private String nome;
    private boolean obbligatorio;
    
    /**
     * Costruttore di classe, accetta come parametri il nome del cam-
     * po e se quest'ultimo è obbligatorio o meno.
     * 
     * @param nome
     * @param obbligatorio
     */
    public Campo(String nome, boolean obbligatorio) {
        this.nome = nome;
        this.obbligatorio = obbligatorio;
    }
    
    /**
     * Metodo che ritorna la lista dei campi nativi che una catego-
     * ria deve avere che possono essere a compilazione obbligatoria
     * o facoltativa.
     *
     * @return lista dei campi nativi necessari a una categoria
     */
    public static List<Campo> getCampiDiDefaultPerCategoriaRadice() {
        return List.of(
                new Campo("Stato di conservazione", true),
                new Campo("Descrizione libera", false)
        );
    }

    /**
     * Metodo per la formattazione che converte un oggetto nella re-
     * lativa rappresentazione di stringa.
     *
     * @return stringa dell'oggetto convertito
     */
    @Override
    public String toString() {
        return "Campo{" +
                "nome='" + nome + '\'' +
                ", obbligatorio=" + obbligatorio +
                '}';
    }
    
    /**
     * Metodo per controllare se un campo è obbligatorio o meno.
     *
     * @return TRUE se il campo è obbligatorio
     *         FALSE se il campo è facoltativo
     */
    public boolean isObbligatorio() {
        return this.obbligatorio;
    }
    
    /**
     * Metodo getter.
     *
     * @return il nome del campo
     */
    public String getNome() {
        return this.nome;
    }
}
