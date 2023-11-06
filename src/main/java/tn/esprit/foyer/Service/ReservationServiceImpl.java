package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Repository.ReservationRepository;

import java.util.List;

public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}


