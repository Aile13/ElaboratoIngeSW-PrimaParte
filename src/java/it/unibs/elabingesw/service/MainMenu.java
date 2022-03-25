package it.unibs.elabingesw.service;

import it.unibs.elabingesw.businesslogic.utente.UserType;
import it.unibs.eliapitozzi.mylib.MyFunctionalMenu;
import it.unibs.eliapitozzi.mylib.VoceEComando;

/**
 * Classe MainMenu per la visualizzazione a video di un menu
 * che permette all'utente di visionare quali operazioni svol-
 * gere.
 *
 * @author Elia Pitozzi
 * @author Ali Laaraj
 */
public class MainMenu {
    private final MacroServices service;

    /**
     * Costruttore di classe che accetta come parametro un
     * oggetto di tipo MacroService.
     * <p>
     * Al suo interno creo un istanza della classe MyFunctionalMenu
     * e mostra a video tre operazioni che si possono effettuare.
     *
     * @param service
     * @see MacroServices
     */
    public MainMenu(MacroServices service) {
        this.service = service;
    }

    /**
     * Metodo che esegue il menu istanziato nel costruttore
     * di classe.
     *
     * @param userType
     */
    public void eseguiMenuByUserType(UserType userType) {
        final MyFunctionalMenu functionalMenu;

        if (userType == UserType.CONFIGURATORE) {
            functionalMenu = new MyFunctionalMenu("Menu per Configuratore",
                    new VoceEComando[]{
                            new VoceEComando("Esci", service::eseguiProceduraDiUscita),
                            new VoceEComando("Crea nuova gerarchia", service::creaNuovaGerarchia),
                            new VoceEComando("Visualizza gerarchie", service::visualizzaGerarchieFormaEstesa)
                    });
        } else {
            functionalMenu = new MyFunctionalMenu("Menu per Fruitore",
                    new VoceEComando[]{
                            new VoceEComando("Esci", service::eseguiProceduraDiUscita),
                            new VoceEComando("Visualizza gerarchie", service::visualizzaGerarchieFormaRidotta),
                            new VoceEComando("Visualizza info scambi", service::visualizzaGerarchieFormaEstesa)
                    });
        }
        functionalMenu.eseguiMenu();
    }
}
