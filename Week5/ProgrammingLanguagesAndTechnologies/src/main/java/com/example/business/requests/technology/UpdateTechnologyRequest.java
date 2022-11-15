package com.example.business.requests.technology;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateTechnologyRequest {

    private int id;
    private String name;
    private int softwareLanguageId;
}
