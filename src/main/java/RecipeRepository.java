package org.example.recipesharingp.repository;

import org.example.recipesharingp.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByApproved(boolean approved);
}