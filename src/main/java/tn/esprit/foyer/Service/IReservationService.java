package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Reservation;

import java.sql.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);
    Reservation getReservationParAnneeUniversitaire(Date date );

}
