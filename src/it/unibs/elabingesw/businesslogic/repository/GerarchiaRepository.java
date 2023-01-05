package it.unibs.elabingesw.businesslogic.repository;

import it.unibs.elabingesw.businesslogic.categoria.GerarchiaDiCategorie;

import java.util.List;

/**
 * @author Elia
 */
public interface GerarchiaRepository {
    List<GerarchiaDiCategorie> getListaGerarchie();

    void salvaGerarchie();

    void inserisciNuovaGerarchia(GerarchiaDiCategorie gerarchiaDiCategorie);

    // TODO: Laaraj 27/nov/2022 Aggiungere doc. metodo nuovo.
    boolean isGerarchiaPresenteByNome(String nomeGerarchia);

    boolean haGerarchie();
}
