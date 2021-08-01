package tech.bongers.dicobo.service;

import org.springframework.stereotype.Service;
import tech.bongers.dicobo.model.Ingredient;
import tech.bongers.dicobo.repository.IngredientRepository;
import tech.bongers.dicobo.service.dto.IngredientDto;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(final IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public Ingredient createIngredient(final IngredientDto ingredientDto) {
        final var ingredient = new Ingredient(ingredientDto.getName(), ingredientDto.getAmount(), ingredientDto.getUnit());
        return ingredientRepository.save(ingredient);
    }
}
