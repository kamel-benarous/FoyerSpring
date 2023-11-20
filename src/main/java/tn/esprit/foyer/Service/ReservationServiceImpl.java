package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Repository.ReservationRepository;
import tn.esprit.foyer.Service.IReservationService;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository resevationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return resevationRepository.findAll() ;
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return resevationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return resevationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation getReservationParAnneeUniversitaire(Date date) {
        return  resevationRepository.findReservationsByAnneeUniversitaire(date);
    }
}