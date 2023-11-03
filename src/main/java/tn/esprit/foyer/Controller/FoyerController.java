package tn.esprit.foyer.Controller;


import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Foyer;
import tn.esprit.foyer.Service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/foyers")
public class FoyerController {
    IFoyerService foyerService;

    @GetMapping("/all")
    public List<Foyer> getAll() {
        return this.foyerService.retrieveAllFoyers();
    }

    @GetMapping("/{idFoyer}")
    public Foyer getById(@PathVariable long idFoyer) {
        return this.foyerService.retrieveFoyer(idFoyer);
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return this.foyerService.addFoyer(f);
    }

    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return this.foyerService.updateFoyer(f);
    }

    @Transactional
    @PutMapping("/archive/{idFoyer}")
    public void archive(@PathVariable long idFoyer) {
        this.foyerService.archiverFoyer(idFoyer);
    }
}
