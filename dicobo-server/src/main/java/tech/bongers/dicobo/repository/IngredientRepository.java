package tech.bongers.dicobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bongers.dicobo.model.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {}
