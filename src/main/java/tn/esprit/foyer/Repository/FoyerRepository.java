package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    @Modifying
    @Query("update Foyer f set f.archived = true where f.idFoyer = :id")
    void UpdateArchiver(@Param("id") long id);
}
