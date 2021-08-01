package tech.bongers.dicobo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import tech.bongers.dicobo.model.Ingredient;
import tech.bongers.dicobo.model.Unit;

public class IngredientDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("amount")
    private Integer amount;

    @JsonProperty("unit")
    private Unit unit;

    public IngredientDto() {
        // No-args
    }

    public IngredientDto(final Ingredient ingredient) {
        this.id = ingredient.getId();
        this.name = ingredient.getName();
        this.amount = ingredient.getAmount();
        this.unit = ingredient.getUnit();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "IngredientDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", unit=" + unit +
                '}';
    }
}
