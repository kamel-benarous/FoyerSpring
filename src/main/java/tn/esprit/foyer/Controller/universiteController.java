package tn.esprit.foyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Universite;
import tn.esprit.foyer.Entity.Universite;
import tn.esprit.foyer.Service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/universite")
public class universiteController {
    IUniversiteService universiteService;

    @GetMapping("/all")
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversities();
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite e) {
        return universiteService.addUniversite(e);
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite e) {
        return universiteService.updateUniversite(e);
    }

    @GetMapping("/get/{idUniversite}")
    public Universite getById(@PathVariable Long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    @DeleteMapping("/delete/{idUniversite}")
    public void delete(@PathVariable Long idUniversite){
        universiteService.removeUniversite(idUniversite);
    }

}
