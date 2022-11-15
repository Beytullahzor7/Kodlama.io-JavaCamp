package com.example.business.responses.softwareLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllSoftwareLanguagesResponse {

    private int id;
    private String name;
    private List<String> technologies;


}
