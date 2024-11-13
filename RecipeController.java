package org.example.recipesharingp.controller;

import org.example.recipesharingp.model.Recipe;
import org.example.recipesharingp.model.User;
import org.example.recipesharingp.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/submit")
    public Recipe submitRecipe(@RequestBody RecipeSubmissionRequest request) {
        // Assuming user is already authenticated and we have the user object.
        // In a real-world scenario, you would fetch the authenticated user.
        // User authenticatedUser = getAuthenticatedUser();
        User authenticatedUser = new User(); // Placeholder

        return recipeService.submitRecipe(
                request.getTitle(),
                request.getIngredients(),
                request.getInstructions(),
                request.getPhotos(),
                authenticatedUser
        );
    }

    @GetMapping("/approved")
    public List<Recipe> getApprovedRecipes() {
        return recipeService.getApprovedRecipes();
    }

    @GetMapping("/pending")
    public List<Recipe> getPendingRecipes() {
        return recipeService.getPendingRecipes();
    }

    @PostMapping("/approve/{id}")
    public void approveRecipe(@PathVariable Long id) {
        recipeService.approveRecipe(id);
    }

    @DeleteMapping("/reject/{id}")
    public void rejectRecipe(@PathVariable Long id) {
        recipeService.rejectRecipe(id);
    }

    // Other recipe-related endpoints...

    static class RecipeSubmissionRequest {
        private String title;
        private String ingredients;
        private String instructions;
        private List<String> photos;

        // Getters and Setters
    }
}