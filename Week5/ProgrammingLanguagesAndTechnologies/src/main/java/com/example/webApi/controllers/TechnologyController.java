package com.example.webApi.controllers;

import com.example.business.abstracts.TechnologyService;
import com.example.business.requests.technology.CreateTechnologyRequest;
import com.example.business.requests.technology.DeleteTechnologyRequest;
import com.example.business.requests.technology.UpdateTechnologyRequest;
import com.example.business.responses.technology.GetAllTechnologiesResponse;
import com.example.business.responses.technology.UpdateTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/technology")
public class TechnologyController {

    private final TechnologyService service;

    public TechnologyController(TechnologyService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<GetAllTechnologiesResponse> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) {
        service.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        service.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest) {
        return service.update(updateTechnologyRequest);
    }
}
