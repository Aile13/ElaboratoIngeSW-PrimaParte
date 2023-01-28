package it.unibs.elabingesw.view.domaintyperenderer.renderers.categoria;

import it.unibs.elabingesw.businesslogic.DomainTypeToRender;
import it.unibs.elabingesw.businesslogic.categoria.CategoriaFiglio;
import it.unibs.elabingesw.view.domaintyperenderer.SelectableDomainTypeRenderer;

/**
 * Classe CategoriaFiglioRenderer che implementa SelectableDomainTypeRenderer.
 *
 * @author Elia Pitozzi
 * @author Ali Laaraj
 */
public class CategoriaFiglioRenderer implements SelectableDomainTypeRenderer {
    
    /**
     * Metodo che restituisce il rendering dell'oggetto in input
     * a cui verrà applicato un cast.
     *
     * @param domainTypeToRender l'oggetto di tipo DomainTypeToRender
     * @return il rendering della categoria figlio
     */
    @Override
    public String render(DomainTypeToRender domainTypeToRender) {
        return "CategoriaFiglio{ " + new CategoriaRenderer().render(domainTypeToRender) + " }";
    }

    /**
     * Metodo che controlla se il renderer può gestire
     * il rendering dell'oggetto che viene passato per
     * parametro.
     *
     * @param domainTypeToRender l'oggetto di tipo DomainTypeToRender
     * @return TRUE se si può gestire il rendering della categoria figlio
     * FALSE se non si può gestire il rendering della categoria figlio
     */
    @Override
    public boolean canHandle(DomainTypeToRender domainTypeToRender) {
        return domainTypeToRender instanceof CategoriaFiglio;
    }
}
