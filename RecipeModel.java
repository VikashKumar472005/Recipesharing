package org.example.recipesharingp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String ingredients;

    @Column(columnDefinition = "TEXT")
    private String instructions;

    @ElementCollection
    @CollectionTable(name = "recipe_photos", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "photo_url")
    private List<String> photos;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Approval status by Admin
    private boolean approved;

    @ElementCollection
    @CollectionTable(name = "recipe_comments", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "comment")
    private List<String> comments;

    @ElementCollection
    @CollectionTable(name = "recipe_ratings", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "rating")
    private List<Integer> ratings;
}