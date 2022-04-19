package technifutur.crespin.FootballManager.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.crespin.FootballManager.model.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
