package technifutur.crespin.FootballManager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technifutur.crespin.FootballManager.metier.service.JoueurService;
import technifutur.crespin.FootballManager.model.dto.JoueurDTO;
import technifutur.crespin.FootballManager.model.entities.Joueur;




import java.util.List;


@RestController
//@RequestMapping
public class JoueurControler {

    private JoueurService service;

    public JoueurControler(JoueurService service) {
        this.service = service;
    }

    // GET - http://localhost:8080/joueur

    @GetMapping("/joueur")
    public List<JoueurDTO> getAll(){
        return service.getAll();
    }


}
