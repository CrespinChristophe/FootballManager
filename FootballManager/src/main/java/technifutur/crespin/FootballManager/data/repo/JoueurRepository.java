package technifutur.crespin.FootballManager.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.crespin.FootballManager.model.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
