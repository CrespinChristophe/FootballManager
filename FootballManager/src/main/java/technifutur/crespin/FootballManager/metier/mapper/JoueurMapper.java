package technifutur.crespin.FootballManager.metier.mapper;

import org.springframework.stereotype.Service;
import technifutur.crespin.FootballManager.model.dto.ClubDTO;
import technifutur.crespin.FootballManager.model.dto.JoueurDTO;
import technifutur.crespin.FootballManager.model.entities.Club;
import technifutur.crespin.FootballManager.model.entities.Joueur;
import technifutur.crespin.FootballManager.model.entities.Manager;
import technifutur.crespin.FootballManager.model.forms.JoueurForm;


@Service
public class JoueurMapper {

    public Joueur formToEntity (JoueurForm form){

        if(form == null)
            return null;

        return Joueur.builder()
                .nom(form.getNom())
                .prenom(form.getPrenom())
                .build();

    }

    public JoueurDTO entityToDTO (Joueur entity){

        if(entity == null)
            return null;

        Club clubEntity = entity.getClub();

        JoueurDTO.ClubDTO club = clubEntity == null ? null :
                new JoueurDTO.ClubDTO(clubEntity.getNom());

        Manager managerEntity = entity.getManager();

        JoueurDTO.ManagerDTO manager =  managerEntity == null ? null :
                new JoueurDTO.ManagerDTO(managerEntity.getNom(), managerEntity.getPrenom());

        return JoueurDTO.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .prenom(entity.getPrenom())
                .clubDTO(club)
                .managerDTO(manager)
                .build();


    }

}
