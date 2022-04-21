package technifutur.crespin.FootballManager.metier.mapper;

import org.springframework.stereotype.Service;
import technifutur.crespin.FootballManager.model.dto.ClubDTO;
import technifutur.crespin.FootballManager.model.entities.Club;
import technifutur.crespin.FootballManager.model.forms.ClubForm;

@Service
public class ClubMapper {

public Club formToEntity (ClubForm form){

    if(form == null)
        return null;

    return Club.builder()
            .matricule(form.getMatricule())
            .nom(form.getNom())
            .adresse(form.getAdresse())
            .build();

}

public ClubDTO entityToDTO (ClubDTO entity){

    if(entity == null)
        return null;

return null;//A EFFACER c'est juste pour annuler l'erreur


    }

}
