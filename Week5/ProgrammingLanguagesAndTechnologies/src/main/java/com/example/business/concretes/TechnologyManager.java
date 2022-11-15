package com.example.business.concretes;

import com.example.business.abstracts.TechnologyService;
import com.example.business.requests.technology.CreateTechnologyRequest;
import com.example.business.requests.technology.DeleteTechnologyRequest;
import com.example.business.requests.technology.UpdateTechnologyRequest;
import com.example.business.responses.technology.GetAllTechnologiesResponse;
import com.example.business.responses.technology.UpdateTechnologyResponse;
import com.example.dataAccess.abstracts.SoftwareLanguageRepository;
import com.example.dataAccess.abstracts.TechnologyRepository;
import com.example.entities.concretes.SoftwareLanguage;
import com.example.entities.concretes.Technology;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TechnologyManager implements TechnologyService {

    private final TechnologyRepository repository;
    private final SoftwareLanguageRepository softwareLanguageRepository;

    public TechnologyManager(TechnologyRepository repository, SoftwareLanguageRepository softwareLanguageRepository) {
        this.repository = repository;
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<GetAllTechnologiesResponse> getAll() {
        List<Technology> technologies = repository.findAll();

        log.info("All Technologies Listed");
        return technologies.stream().map(technology -> GetAllTechnologiesResponse.builder()
                .id(technology.getId())
                .name(technology.getName())
                .softwareLanguageId(technology.getSoftwareLanguage().getId())
                .build()).toList();
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Optional<SoftwareLanguage> softwareLanguage = softwareLanguageRepository.findById(createTechnologyRequest.getSoftwareLanguageId());
        Technology technology = new Technology();

        if (softwareLanguage.isPresent() &&
                !isNullOrEmpty(createTechnologyRequest.getName()) &&
                !isNameRepeated(createTechnologyRequest.getName())) {
            technology.setName(createTechnologyRequest.getName());
            technology.setSoftwareLanguage(softwareLanguage.get());
        } else {
            log.error("Exception Occured!");
            throw new RuntimeException("Software Language With " + createTechnologyRequest.getSoftwareLanguageId() + " Does Not Exists!");
        }
        repository.save(technology);
        log.info("Technology With " + createTechnologyRequest.getSoftwareLanguageId() + " Added To Database");
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        Optional<Technology> technology = repository.findById(deleteTechnologyRequest.getId());

        if (technology.isPresent()) {
            repository.delete(technology.get());
            log.info("Technology With " + deleteTechnologyRequest.getId() + " Deleted");
        } else {
            throw new RuntimeException("Technology With " + deleteTechnologyRequest.getId() + " Does Not Exist!");
        }
    }

    @Override
    public UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest) {
        Optional<Technology> technology = repository.findById(updateTechnologyRequest.getId());
        Optional<SoftwareLanguage> softwareLanguage = softwareLanguageRepository.findById(updateTechnologyRequest.getSoftwareLanguageId());

        if (technology.isPresent() &&
                softwareLanguage.isPresent() &&
                !isNullOrEmpty(updateTechnologyRequest.getName()) &&
                !isNameRepeated(updateTechnologyRequest.getName())) {
            technology.get().setName(updateTechnologyRequest.getName());
            technology.get().setSoftwareLanguage(softwareLanguage.get());
            repository.save(technology.get());
            log.info("Technology With " + updateTechnologyRequest.getId() + " Updated");

            return UpdateTechnologyResponse.builder()
                    .id(technology.get().getId())
                    .name(updateTechnologyRequest.getName())
                    .softwareLanguageId(updateTechnologyRequest.getSoftwareLanguageId())
                    .build();
        } else {
            throw new RuntimeException("Technology or Software Language Does Not Exist!");
        }
    }

    private boolean isNullOrEmpty(String name) {
        return isNullOrEmpty(name);
    }

    private boolean isNameRepeated(String name) {
        List<Technology> technologies = repository.findAll();
        return technologies.stream().anyMatch(i -> i.getName().equalsIgnoreCase(name));
    }
}
