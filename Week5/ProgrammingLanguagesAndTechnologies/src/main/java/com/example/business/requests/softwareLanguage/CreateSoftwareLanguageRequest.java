package com.example.business.requests.softwareLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateSoftwareLanguageRequest {

    //Instead of creating manuel validation method, we can use annotation based control here
    private String name;

}
