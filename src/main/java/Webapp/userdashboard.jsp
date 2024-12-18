<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recipe Sharing Platform - User Dashboard</title>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <style>
        /* Custom CSS */
        .dashboard-header {
            text-align: center;
            margin-top: 20px;
        }
        .recipe-card {
            margin-bottom: 20px;
        }
        .welcome-message {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <a class="navbar-brand" href="#">RecipeShare</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">My Recipes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Favorites</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Logout</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Main Content -->
    <div class="container">
        <h1 class="dashboard-header">User Dashboard</h1>
        <div class="welcome-message">
            <h2>Welcome, [User Name]!</h2>
            <p>Here you can manage your recipes, view your favorites, and update your profile.</p>
        </div>
        
        <h3>My Recipes</h3>
        <div class="row">
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="recipe1.jpg" alt="Recipe 1">
                    <div class="card-body">
                        <h5 class="card-title">Recipe 1</h5>
                        <p class="card-text">A short description of Recipe 1.</p>
                        <a href="#" class="btn btn-primary">Edit Recipe</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="recipe2.jpg" alt="Recipe 2">
                    <div class="card-body">
                        <h5 class="card-title">Recipe 2</h5>
                        <p class="card-text">A short description of Recipe 2.</p>
                        <a href="#" class="btn btn-primary">Edit Recipe</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="recipe3.jpg" alt="Recipe 3">
                    <div class="card-body">
                        <h5 class="card-title">Recipe 3</h5>
                        <p class="card-text">A short description of Recipe 3.</p>
                        <a href="#" class="btn btn-primary">Edit Recipe</a>
                    </div>
                </div>
            </div>
        </div>
        
        <h3>Favorites</h3>
        <div class="row">
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="favorite1.jpg" alt="Favorite 1">
                    <div class="card-body">
                        <h5 class="card-title">Favorite Recipe 1</h5>
                        <p class="card-text">A short description of Favorite Recipe 1.</p>
                        <a href="#" class="btn btn-primary">View Recipe</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="favorite2.jpg" alt="Favorite 2">
                    <div class="card-body">
                        <h5 class="card-title">Favorite Recipe 2</h5>
                        <p class="card-text">A short description of Favorite Recipe 2.</p>
                        <a href="#" class="btn btn-primary">View Recipe</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4 recipe-card">
                <div class="card">
                    <img class="card-img-top" src="favorite3.jpg" alt="Favorite 3">
                    <div class="card-body">
                        <h5 class="card-title">Favorite Recipe 3</h5>
                        <p class="card-text">A short description of Favorite Recipe 3.</p>
                        <a href="#" class="btn btn-primary">View Recipe</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
