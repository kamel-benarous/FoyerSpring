package tn.esprit.foyer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class universiteController {

    @GetMapping()
    public String index() {
        return "Université Controller";
    }
}
