package com.example.webApi.controllers;

import com.example.business.abstracts.SoftwareLanguageService;
import com.example.business.requests.softwareLanguage.CreateSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.DeleteSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.UpdateSoftwareLanguageRequest;
import com.example.business.requests.technology.UpdateTechnologyRequest;
import com.example.business.responses.softwareLanguage.GetAllSoftwareLanguagesResponse;
import com.example.business.responses.softwareLanguage.UpdateSoftwareLanguageResponse;
import com.example.business.responses.technology.UpdateTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/softwarelanguage")
public class SoftwareLanguageController {

    private final SoftwareLanguageService service;

    public SoftwareLanguageController(SoftwareLanguageService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<GetAllSoftwareLanguagesResponse> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateSoftwareLanguageRequest createSoftwareLanguageRequest) {
        service.add(createSoftwareLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
        service.delete(deleteSoftwareLanguageRequest);
    }

    @PutMapping("/update")
    public UpdateSoftwareLanguageResponse update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
        return service.update(updateSoftwareLanguageRequest);
    }
}
