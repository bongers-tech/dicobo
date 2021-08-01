package tech.bongers.dicobo.service.converter;

import tech.bongers.dicobo.model.Recipe;
import tech.bongers.dicobo.service.dto.RecipeDto;

/**
 * Converter utility to convert {@link Recipe} objects to {@link RecipeDto} and vice versa.
 */
public final class RecipeConverter {

    private RecipeConverter() {
        // No-args
    }

    public static RecipeDto convertToDto(final Recipe recipe) {
        final RecipeDto recipeDto = new RecipeDto();
        recipeDto.setId(recipe.getId());
        return recipeDto;
    }
}
