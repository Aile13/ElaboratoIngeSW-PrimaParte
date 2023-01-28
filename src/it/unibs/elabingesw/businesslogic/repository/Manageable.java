package it.unibs.elabingesw.businesslogic.repository;

/**
 * Interfaccia Manageable.
 * <p>
 * Invariante di classe: l'oggetto di tipo Manageable
 * deve avere inizializzato un nome o degli attributi
 * che possono ricostruirne uno per poter identificare
 * univocamente l'oggetto mediante il metodo di
 * questa interfaccia.
 *
 * @author Elia Pitozzi
 * @author Ali Laaraj
 */
public interface Manageable {

    /**
     * Firma di un metodo che controlla se
     * il nome passato come parametro
     * coincide con il nome associato all'oggetto
     * su cui si richiama il metodo stesso.
     * <p>
     * Precondizione: l'oggetto di tipo Manageable
     * deve avere un nome associato per poter operare
     * un confronto con il parametro del metodo.
     * Inoltre si assume che il parametro non sia nullo
     * o coincidente con la stringa vuota.
     *
     * @param nome il nome da usare nel confronto
     */
    boolean isStessoNome(String nome);
}
