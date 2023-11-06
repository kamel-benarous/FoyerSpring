package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Foyer;
import tn.esprit.foyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void archiverFoyer(long idFoyer) {
        foyerRepository.archiveById(idFoyer);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
