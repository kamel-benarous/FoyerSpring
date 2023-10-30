package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);
    void removeUniversite  (long idUniversite );
}
