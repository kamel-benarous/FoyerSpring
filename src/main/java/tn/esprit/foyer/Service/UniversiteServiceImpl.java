package tn.esprit.foyer.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Universite;
import tn.esprit.foyer.Repository.FoyerRepository;
import tn.esprit.foyer.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);
        if(u!=null) {
            u.setFoyer(foyerRepository.findById(idFoyer).get());
        }
        return universiteRepository.save(u);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        if(universite != null) universite.setFoyer(null);
        return universiteRepository.save(universite);
    }
}

