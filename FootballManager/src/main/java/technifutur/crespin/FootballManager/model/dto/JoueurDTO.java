package technifutur.crespin.FootballManager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JoueurDTO {

    private Long id;
    private String nom;
    private String prenom;
    private ClubDTO clubDTO;
    private ManagerDTO managerDTO;

    @Data
    @AllArgsConstructor
    public static class ClubDTO {
        private String nom;
    }

    @Data
    @AllArgsConstructor
    public static class ManagerDTO {
        private String nom;
        private String prenom;
    }

}
