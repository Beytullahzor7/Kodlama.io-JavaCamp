package com.example.business.abstracts;

import com.example.business.requests.softwareLanguage.CreateSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.DeleteSoftwareLanguageRequest;
import com.example.business.requests.softwareLanguage.UpdateSoftwareLanguageRequest;
import com.example.business.responses.softwareLanguage.GetAllSoftwareLanguagesResponse;
import com.example.business.responses.softwareLanguage.UpdateSoftwareLanguageResponse;

import java.util.List;

public interface SoftwareLanguageService {

    List<GetAllSoftwareLanguagesResponse> getAll();

    void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest);

    void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);

    UpdateSoftwareLanguageResponse update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);
}
