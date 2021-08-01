package tech.bongers.dicobo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipeDto {

    @JsonProperty("id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
