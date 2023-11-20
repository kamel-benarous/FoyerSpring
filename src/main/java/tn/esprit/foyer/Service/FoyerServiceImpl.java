package tn.esprit.foyer.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
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

    @Transactional
    public void archiverFoyer(long idFoyer) {
        foyerRepository.UpdateArchiver(idFoyer);
    }
}