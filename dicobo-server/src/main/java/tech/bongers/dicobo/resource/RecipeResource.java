package tech.bongers.dicobo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.bongers.dicobo.model.Recipe;
import tech.bongers.dicobo.service.converter.RecipeConverter;
import tech.bongers.dicobo.service.dto.RecipeDto;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeResource {

    @GetMapping
    public ResponseEntity<List<RecipeDto>> getAllRecipes() {
        final var recipe = new Recipe();
        recipe.setId(1L);

        final var recipeDto = RecipeConverter.convertToDto(recipe);
        return ResponseEntity.ok(Collections.singletonList(recipeDto));
    }
}
