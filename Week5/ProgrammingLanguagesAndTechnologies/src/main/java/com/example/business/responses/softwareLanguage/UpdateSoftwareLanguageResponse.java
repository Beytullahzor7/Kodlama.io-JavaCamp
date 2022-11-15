package com.example.business.responses.softwareLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateSoftwareLanguageResponse {

    private int id;
    private String name;
}
