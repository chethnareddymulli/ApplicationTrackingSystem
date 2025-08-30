# Application Tracking System (ATS)

Project Overview

The Application Tracking System (ATS) is a web-based application designed to help recruiters and HR professionals automatically evaluate resumes against job descriptions. Instead of manually reviewing each resume, this system extracts important keywords from resumes and job descriptions, calculates a matching percentage, and provides insights to quickly shortlist candidates.

This project follows Software Development Life Cycle (SDLC) methodology to ensure structured development, proper testing, and maintainable code.

Problem Statement

Manually reviewing resumes for job applications is time-consuming and prone to errors. Recruiters may miss qualified candidates or spend too much time analyzing resumes. An automated system can speed up the hiring process and improve accuracy in matching candidates with job requirements.

Objective

Automate the evaluation of resumes against job descriptions.

Provide a matching percentage to quantify alignment.

Offer an easy-to-use interface for HR/recruiters.

Store resumes, job descriptions, and results in a database for record-keeping.

Features

Upload resumes (PDF/DOCX) and job descriptions.

Automatic keyword extraction from both resumes and job descriptions.

Calculate similarity/matching percentage.

Display results clearly with visual indicators (progress bars or numerical scores).

Maintain database of uploaded resumes and job descriptions for future reference.

Deployed on Microsoft Azure for real-world accessibility and testing.

System Architecture

Frontend: HTML + JavaScript for user interaction.
Backend: Java Spring Boot + Hibernate for business logic and database interaction.
Database: SQL (MySQL/PostgreSQL) for storing resumes, job descriptions, and matching results.
Deployment: Microsoft Azure for cloud hosting.

Data Flow:

User uploads resume and job description.

Backend parses and extracts keywords from both files.

Matching algorithm calculates a score based on keyword alignment.

Result is displayed on the frontend.

Data is saved in the database for future access.

Backend Implementation

Spring Boot handles REST API endpoints.

Hibernate maps Java objects to SQL database tables.

Business Logic:

Parse uploaded resume and JD.

Extract keywords and relevant skills.

Compute matching percentage using a simple comparison algorithm.

Exception Handling: Ensures invalid file formats or missing uploads are handled gracefully.

Backend Folder Structure Example:

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

Frontend Implementation

HTML: File upload forms for resumes and job descriptions.

JavaScript:

Sends files to backend using HTTP requests.

Displays matching results dynamically.

UX Features:

Progress bars for matching percentage.

Clear error messages for invalid uploads.

Database Design

Tables:

Resume

id (Primary Key)

candidateName

filePath

uploadDate

JobDescription

id (Primary Key)

jobTitle

filePath

uploadDate

Result

id (Primary Key)

resumeId (Foreign Key)

jobDescriptionId (Foreign Key)

matchingPercentage

This structure ensures all resumes, job descriptions, and results are tracked and retrievable.

Deployment

Deployed on Microsoft Azure App Service.

Database hosted on Azure SQL.

Provides scalability for multiple users and real-time testing.

Deployment Steps:

Build Spring Boot application (JAR/WAR).

Configure Azure App Service.

Deploy backend.

Connect frontend files and database.

Setup & Installation

Prerequisites:

Java 17+

Maven

SQL Server / MySQL

Node.js (optional)

Installation Steps:

Clone the repository:

git clone <repository-url>
cd ats-project


Import project into Eclipse/IntelliJ as a Maven project.

Configure database in application.properties.

Build project:

mvn clean install


Run Spring Boot application:

mvn spring-boot:run


Open index.html in a browser.

Upload resume and job description to test.

Usage

Open the ATS interface in a browser.

Upload candidate resume (PDF/DOCX).

Upload job description.

Click “Evaluate”.

Matching percentage appears along with keyword highlights.

Data saved in SQL database for future reference.

Testing

Unit testing with JUnit.

Backend tests cover:

Resume parsing

Keyword extraction

Matching algorithm

API endpoints

Technologies Used

Backend: Java, Spring Boot, Hibernate

Frontend: HTML, JavaScript

Database: SQL (MySQL/PostgreSQL)

Testing: JUnit

Deployment: Microsoft Azure

Learning Outcomes

Learned to integrate Spring Boot with Hibernate.

Built REST APIs and connected frontend with backend.

Parsed and analyzed resumes using Java.

Deployed a real-world application on Microsoft Azure.

Learned to design a database schema for tracking data.

Contributions

Designed backend service for parsing, keyword extraction, and matching.

Built frontend interface for uploads and result display.

Connected frontend and backend for real-time functionality.

Deployed application on Azure for cloud testing.

Future Enhancements

Add AI-based resume analysis for better skill detection.

Include multiple resume format support (PDF, DOCX, TXT).

Generate detailed reports for recruiters.

Allow batch upload of resumes for bulk processing.

License

This project is open for learning and academic purposes.
