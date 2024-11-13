package org.example.recipesharingp.service;

import org.example.recipesharingp.model.Recipe;
import org.example.recipesharingp.model.User;
import org.example.recipesharingp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe submitRecipe(String title, String ingredients, String instructions, List<String> photos, User user) {
        Recipe recipe = new Recipe();
        recipe.setTitle(title);
        recipe.setIngredients(ingredients);
        recipe.setInstructions(instructions);
        recipe.setPhotos(photos);
        recipe.setUser(user);

        return recipeRepository.save(recipe);
    }

    public List<Recipe> getApprovedRecipes() {
        return recipeRepository.findByApproved(true);
    }

    public List<Recipe> getPendingRecipes() {
        return recipeRepository.findByApproved(false);
    }

    public void approveRecipe(Long recipeId) {
        Recipe recipe = recipeRepository.findById(recipeId).orElseThrow(() -> new RuntimeException("Recipe not found"));
        recipe.setApproved(true);
        recipeRepository.save(recipe);
    }

    public void rejectRecipe(Long recipeId) {
        recipeRepository.deleteById(recipeId);
    }

    // Other recipe-related methods...
}