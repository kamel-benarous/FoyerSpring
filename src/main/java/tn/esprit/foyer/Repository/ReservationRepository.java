package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Reservation;

import java.sql.Date;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
    Reservation findByIdReservation(String idReservation);
    Reservation findReservationsByAnneeUniversitaire(Date date);
}
