package com.example.business.concretes;

import com.example.business.abstracts.SoftwareLanguageService;
import com.example.business.requests.softwareLanguage.CreateSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.DeleteSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.UpdateSoftwareLanguageRequest;
import com.example.business.requests.technology.UpdateTechnologyRequest;
import com.example.business.responses.softwareLanguage.GetAllSoftwareLanguagesResponse;
import com.example.business.responses.softwareLanguage.UpdateSoftwareLanguageResponse;
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
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private final SoftwareLanguageRepository repository;

    public SoftwareLanguageManager(SoftwareLanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GetAllSoftwareLanguagesResponse> getAll() {
        List<SoftwareLanguage> softwareLanguages = repository.findAll();

        log.info("All Software Languages Listed");
        return softwareLanguages.stream().map(softwareLanguage -> GetAllSoftwareLanguagesResponse.builder()
                        .id(softwareLanguage.getId())
                        .name(softwareLanguage.getName())
                        .technologies(softwareLanguage.getTechnologies()
                                .stream().map(Technology::getName).toList())
                        .build())
                .toList();
    }

    @Override
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) {
        if (!isNameRepeated(createSoftwareLanguageRequest.getName())) {
            SoftwareLanguage softwareLanguage = new SoftwareLanguage();
            softwareLanguage.setName(createSoftwareLanguageRequest.getName());
            repository.save(softwareLanguage);
            log.info("Software Language With " + createSoftwareLanguageRequest.getName() + " Added to Database");
        }
    }

    @Override
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
        Optional<SoftwareLanguage> softwareLanguage = repository.findById(deleteSoftwareLanguageRequest.getId());

        if (softwareLanguage.isPresent()) {
            repository.delete(softwareLanguage.get());
            log.info("Software Language With " + deleteSoftwareLanguageRequest.getId() + " Deleted");
        } else {
            throw new RuntimeException("Software Language With " + deleteSoftwareLanguageRequest.getId() + " Does Not Exists!");
        }
    }

    @Override
    public UpdateSoftwareLanguageResponse update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
        Optional<SoftwareLanguage> softwareLanguage = repository.findById(updateSoftwareLanguageRequest.getId());

        if (softwareLanguage.isPresent() && !isNameRepeated(updateSoftwareLanguageRequest.getName()) && !isNullOrEmpty(updateSoftwareLanguageRequest.getName())) {
            softwareLanguage.get().setName(updateSoftwareLanguageRequest.getName());
            repository.save(softwareLanguage.get());
            log.info("Software Language With " + updateSoftwareLanguageRequest.getId() + " Updated");
            return UpdateSoftwareLanguageResponse.builder()
                    .id(softwareLanguage.get().getId())
                    .name(updateSoftwareLanguageRequest.getName())
                    .build();
        } else {
            throw new RuntimeException("Software Language With " + updateSoftwareLanguageRequest.getId() + " Does Not Exists!");
        }
    }

    private boolean isNullOrEmpty(String name) {
        return isNullOrEmpty(name);
    }

    private boolean isNameRepeated(String name) {
        List<SoftwareLanguage> softwareLanguages = repository.findAll();
        return softwareLanguages.stream().anyMatch(i -> i.getName().equalsIgnoreCase(name));
    }
}
