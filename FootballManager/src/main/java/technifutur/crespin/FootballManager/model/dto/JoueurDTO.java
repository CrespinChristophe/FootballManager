package technifutur.crespin.FootballManager.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JoueurDTO {

    private int id;
    private String nom;
    private String prenom;

}
