# Application Tracking System (ATS)

**Project Date:** April 2025
**Tech Stack:** Java, Spring Boot, Hibernate, SQL, HTML, JavaScript, JUnit, Microsoft Azure

---

## Table of Contents

1. Project Overview
2. Problem Statement
3. Objective
4. Features
5. System Architecture
6. Backend Implementation
7. Frontend Implementation
8. Database Design
9. Deployment
10. Setup & Installation
11. Usage
12. Testing
13. Technologies Used
14. Learning Outcomes
15. Contributions
16. Future Enhancements
17. License

---

## Project Overview

The **Application Tracking System (ATS)** is a web-based application designed to help recruiters and HR professionals automatically evaluate resumes against job descriptions. Instead of manually reviewing each resume, this system extracts important keywords from resumes and job descriptions, calculates a matching percentage, and provides insights to quickly shortlist candidates.

This project follows **Software Development Life Cycle (SDLC)** methodology to ensure structured development, proper testing, and maintainable code.

---

## Problem Statement

Manually reviewing resumes for job applications is **time-consuming and prone to errors**. Recruiters may miss qualified candidates or spend too much time analyzing resumes. An automated system can **speed up the hiring process** and **improve accuracy** in matching candidates with job requirements.

---

## Objective

* Automate the evaluation of resumes against job descriptions.
* Provide a matching percentage to quantify alignment.
* Offer an easy-to-use interface for HR/recruiters.
* Store resumes, job descriptions, and results in a database for record-keeping.

---

## Features

* Upload resumes (PDF/DOCX) and job descriptions.
* Automatic keyword extraction from both resumes and job descriptions.
* Calculate similarity/matching percentage.
* Display results clearly with visual indicators (progress bars or numerical scores).
* Maintain database of uploaded resumes and job descriptions for future reference.
* Deployed on Microsoft Azure for cloud accessibility and testing.

---

## System Architecture

**Frontend:** HTML + JavaScript for user interaction.
**Backend:** Java Spring Boot + Hibernate for business logic and database interaction.
**Database:** SQL (MySQL/PostgreSQL) for storing resumes, job descriptions, and matching results.
**Deployment:** Microsoft Azure for cloud hosting.

**Data Flow:**

1. User uploads resume and job description.
2. Backend parses and extracts keywords from both files.
3. Matching algorithm calculates a score based on keyword alignment.
4. Result is displayed on the frontend.
5. Data is saved in the database for future access.

---

## Backend Implementation

* **Spring Boot** handles REST API endpoints.
* **Hibernate** maps Java objects to SQL database tables.
* **Business Logic:**

  * Parse uploaded resume and JD.
  * Extract keywords and relevant skills.
  * Compute matching percentage using a simple comparison algorithm.
* **Exception Handling:** Ensures invalid file formats or missing uploads are handled gracefully.

**Backend Folder Structure Example:**

```
src/main/java/com/ats/
├── controller/
│   └── ATSController.java      # Handles HTTP requests
├── entity/
│   ├── Resume.java             # Resume entity
│   └── JobDescription.java     # Job Description entity
├── repository/
│   ├── ResumeRepository.java
│   └── JobDescriptionRepository.java
├── service/
│   └── ATSService.java         # Business logic
└── Application.java            # Spring Boot main class
```

---

## Frontend Implementation

* **HTML:** File upload forms for resumes and job descriptions.
* **JavaScript:**

  * Sends files to backend using HTTP requests.
  * Displays matching results dynamically.
* **UX Features:**

  * Progress bars for matching percentage.
  * Clear error messages for invalid uploads.

---

## Database Design

**Tables:**

1. `Resume`

   * id (Primary Key)
   * candidateName
   * filePath
   * uploadDate

2. `JobDescription`

   * id (Primary Key)
   * jobTitle
   * filePath
   * uploadDate

3. `Result`

   * id (Primary Key)
   * resumeId (Foreign Key)
   * jobDescriptionId (Foreign Key)
   * matchingPercentage

---

## Deployment

* Deployed on **Microsoft Azure App Service**.
* Database hosted on Azure SQL.
* Provides scalability for multiple users and real-time testing.
* Deployment Steps:

  1. Build Spring Boot application (JAR/WAR).
  2. Configure Azure App Service.
  3. Deploy backend.
  4. Connect frontend files and database.

---

## Setup & Installation

**Prerequisites:**

* Java 17+
* Maven
* SQL Server / MySQL
* Node.js (optional)

**Installation Steps:**

1. Clone the repository:

```
git clone <repository-url>
cd ats-project
```

2. Import project into **Eclipse/IntelliJ** as a Maven project.
3. Configure database in `application.properties`.
4. Build project:

```
mvn clean install
```

5. Run Spring Boot application:

```
mvn spring-boot:run
```

6. Open `index.html` in a browser.
7. Upload resume and job description to test.

---

## Usage

1. Open the ATS interface in a browser.
2. Upload candidate resume (PDF/DOCX).
3. Upload job description.
4. Click **“Evaluate”**.
5. Matching percentage appears along with keyword highlights.
6. Data saved in SQL database for future reference.

---

## Testing

* Unit testing with **JUnit**.
* Backend tests cover:

  * Resume parsing
  * Keyword extraction
  * Matching algorithm
  * API endpoints

---

## Technologies Used

* **Backend:** Java, Spring Boot, Hibernate
* **Frontend:** HTML, JavaScript
* **Database:** SQL (MySQL/PostgreSQL)
* **Testing:** JUnit
* **Deployment:** Microsoft Azure

---

## Learning Outcomes

* Learned to integrate **Spring Boot with Hibernate**.
* Built REST APIs and connected frontend with backend.
* Parsed and analyzed resumes using Java.
* Deployed a real-world application on **Microsoft Azure**.
* Learned to design a database schema for tracking data.

---

## Contributions

* Designed backend service for parsing, keyword extraction, and matching.
* Built frontend interface for uploads and result display.
* Connected frontend and backend for real-time functionality.
* Deployed application on Azure for cloud testing.

---

## Future Enhancements

* Add AI-based resume analysis for better skill detection.
* Include multiple resume format support (PDF, DOCX, TXT).
* Generate detailed reports for recruiters.
* Allow batch upload of resumes for bulk processing.

---

## License

This project is **open for learning and academic purposes**.
