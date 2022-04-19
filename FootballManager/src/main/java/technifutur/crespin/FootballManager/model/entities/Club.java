package technifutur.crespin.FootballManager.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table
public class Club {

    @Id
    @Column(nullable = false, columnDefinition = "SMALLINT")
    private short matricule; // à voir s'il n'y aura pas un bleme de conversion java ==> DB et inversement

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String adresse;

    @OneToMany(mappedBy = "club")
    private List<Joueur> joueurList = new ArrayList<>();




}
