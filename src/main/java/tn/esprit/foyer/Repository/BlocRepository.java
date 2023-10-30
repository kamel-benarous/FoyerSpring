package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

    Bloc findBlocByNomBloc(String nomBloc);


}
