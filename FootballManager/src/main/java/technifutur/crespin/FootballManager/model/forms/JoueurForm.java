package technifutur.crespin.FootballManager.model.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class JoueurForm {

    @NotBlank
    @Size(min = 1, max = 50)
    private String nom;
    @NotBlank
    @Size(min = 1, max = 50)
    private String prenom;

}
