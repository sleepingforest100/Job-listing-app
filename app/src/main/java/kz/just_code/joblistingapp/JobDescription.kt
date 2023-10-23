package kz.just_code.joblistingapp

data class JobDescription(
    val id: Int,
    val imageResource: Int,   // Resource ID for the job image
    val title: String,        // Job title
    val location: String,     // Job location
    val date: String,         // Job date
    val salary: String,       // Salary information
    val status: String, // Job status (e.g., "Applied" or "Expires Soon")
    val isLiked: Boolean
)