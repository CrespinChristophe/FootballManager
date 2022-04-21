package technifutur.crespin.FootballManager.model.forms;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Validated
public class ManagerForm {

    @NotBlank
    @Size(min = 1, max = 50)
    private String nom;
    @NotBlank
    @Size(min = 1, max = 50)
    private String prenom;

}
