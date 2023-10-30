package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
