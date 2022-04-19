package technifutur.crespin.FootballManager.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.crespin.FootballManager.model.entities.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
}
