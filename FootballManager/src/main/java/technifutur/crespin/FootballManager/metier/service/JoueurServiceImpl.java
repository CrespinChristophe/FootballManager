package technifutur.crespin.FootballManager.metier.service;

import org.springframework.stereotype.Service;
import technifutur.crespin.FootballManager.data.repo.JoueurRepository;
import technifutur.crespin.FootballManager.metier.mapper.JoueurMapper;
import technifutur.crespin.FootballManager.model.dto.JoueurDTO;

import java.util.List;

@Service
public class JoueurServiceImpl implements JoueurService {

    private JoueurRepository repository;
    private JoueurMapper mapper;

    public JoueurServiceImpl(JoueurRepository repository, JoueurMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<JoueurDTO> getAll() {

        return repository.findAll()
                .stream()
                .map(mapper::entityToDTO)
                .toList();
    }
}
