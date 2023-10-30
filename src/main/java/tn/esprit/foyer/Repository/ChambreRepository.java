package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Bloc;
import tn.esprit.foyer.Entity.Chambre;

import java.util.List;


public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findChambreByBloc(Bloc bloc);
}
