package com.example.business.responses.technology;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateTechnologyResponse {

    private int id;
    private String name;
    private int softwareLanguageId;
}
