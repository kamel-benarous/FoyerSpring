package tn.esprit.foyer.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Etudiant;
import tn.esprit.foyer.Service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;

    @GetMapping("/all")
    public List<Etudiant> getAll() {
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PostMapping("/addAll")
    public List<Etudiant> addAllEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @GetMapping("/get/{idEtudiant}")
    public Etudiant getById(@PathVariable Long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/delete/{idEtudiant}")
    public void delete(@PathVariable Long idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);
    }

}
