package kz.just_code.joblistingapp

data class JobDescription(
    val id: Int,
    val title: String, // Job title
    val description: String,
    val location: String,     // Job location
    val date: String,         // Job date
    val salary: String,       // Salary information
    val status: String, // Job status (e.g., "Applied" or "Expires Soon")
    val isLiked: Boolean
)