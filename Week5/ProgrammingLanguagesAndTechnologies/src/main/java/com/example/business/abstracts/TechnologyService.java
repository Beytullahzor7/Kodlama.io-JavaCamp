package com.example.business.abstracts;

import com.example.business.requests.technology.CreateTechnologyRequest;
import com.example.business.requests.technology.DeleteTechnologyRequest;
import com.example.business.requests.technology.UpdateTechnologyRequest;
import com.example.business.responses.technology.GetAllTechnologiesResponse;
import com.example.business.responses.technology.UpdateTechnologyResponse;

import java.util.List;

public interface TechnologyService {

    List<GetAllTechnologiesResponse> getAll();

    void add(CreateTechnologyRequest createTechnologyRequest);

    void delete(DeleteTechnologyRequest deleteTechnologyRequest);

    UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest);
}
