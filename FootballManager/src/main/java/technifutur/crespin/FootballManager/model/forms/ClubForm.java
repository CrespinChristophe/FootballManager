package technifutur.crespin.FootballManager.model.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClubForm {

    @NotBlank
    @Size(min = 1)
    private short matricule;
    @NotBlank
    @Size(min = 1, max = 50)
    private String nom;
    @NotBlank
    @Size(min = 1, max = 50)
    private String adresse;

}
