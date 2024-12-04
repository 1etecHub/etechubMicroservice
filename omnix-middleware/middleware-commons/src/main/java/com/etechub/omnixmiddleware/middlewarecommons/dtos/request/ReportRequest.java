package com.etechub.omnixmiddleware.middlewarecommons.dtos.request;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
public class ReportRequest {

    private String title;
    private String description;
}
