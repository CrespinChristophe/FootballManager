package technifutur.crespin.FootballManager.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ManagerDTO {

    private Long id;
    private String nom;
    private String prenom;
    private List<JoueurDTO> joueurDTOList;

    @Data
    @AllArgsConstructor
    private static class JoueurDTO {

        private Long id;
        private String nom;
        private String prenom;

    }

}
