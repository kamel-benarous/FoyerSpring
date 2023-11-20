package tn.esprit.foyer.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Chambre;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Service.IReservationService;

import java.sql.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/reservations")
@CrossOrigin("*")
public class ReservationController {
    IReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.retrieveAllReservation();
    }
    @GetMapping("/{id}")
    public Reservation getBlocById(@PathVariable String id){
        return reservationService.retrieveReservation(id);
    }


    @PutMapping("/update")
    public Reservation updateBloc( @RequestBody Reservation  res){
        return reservationService.updateReservation(res);
    }
    @GetMapping("/getbydate")
    public Reservation getReservationById(@RequestParam("Date") Date date){
        return  reservationService.getReservationParAnneeUniversitaire(date);
    }
}
