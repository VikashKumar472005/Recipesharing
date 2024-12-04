// Simulate user login (this would normally be handled by a server)
document.getElementById("loginForm").addEventListener("submit", function(e) {
    e.preventDefault();
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (username === "admin" && password === "admin123") {
        window.location.href = "admin_dashboard.html"; // Redirect to admin dashboard
    } else if (username === "user" && password === "user123") {
        window.location.href = "user_dashboard.html"; // Redirect to user dashboard
    } else {
        alert("Invalid credentials");
    }
});


// Handle login form submission
document.getElementById("loginForm").addEventListener("submit", function(e) {
    e.preventDefault();
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // Simulate login process
    if (username === "admin" && password === "admin123") {
        window.location.href = "admin_dashboard.html"; // Redirect to admin dashboard
    } else if (username === "user" && password === "user123") {
        window.location.href = "user_dashboard.html"; // Redirect to user dashboard
    } else {
        alert("Invalid credentials");
    }
});

