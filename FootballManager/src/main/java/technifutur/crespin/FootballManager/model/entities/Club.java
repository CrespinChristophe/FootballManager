package technifutur.crespin.FootballManager.model.entities;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table
public class Club {

    @Id
    @Column(nullable = false)
    private Long matricule;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String adresse;

}
