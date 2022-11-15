package com.example.business.requests.softwareLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateSoftwareLanguageRequest {

    private int id;
    private String name;
}
