package technifutur.crespin.FootballManager.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClubDTO {

    private short matricule;
    private String nom;
    private String adresse;
    private List<JoueurDTO> joueurDTOList;

    @Data
    @AllArgsConstructor
    private static class JoueurDTO {

        private Long id;
        private String nom;
        private String prenom;

    }

}
