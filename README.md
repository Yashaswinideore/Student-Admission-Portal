# 🏫 College Admission Portal

<div align="center">
<img src="https://cdn-icons-png.flaticon.com/512/3135/3135768.png" alt="College Admission Portal Logo" width="200">
  <br>
  <h3>Streamlining College Admissions with Technology</h3>
  
  ![Java](https://img.shields.io/badge/java-17-orange)
  ![Spring Boot](https://img.shields.io/badge/springboot-2.7-brightgreen)
  ![Status](https://img.shields.io/badge/status-active-success)
</div>

## 📑 Table of Contents
- [Overview](#-overview)
- [Key Features](#-key-features)
- [Technology Stack](#-technology-stack)
- [Installation](#-installation)
- [Configuration](#-configuration)
- [Usage Guide](#-usage-guide)
- [Admin Panel](#-admin-panel)
- [Project Documentation](#-project-documentation)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)

## 🌟 Overview

The **College Admission Portal** is a web-based application built with **Java Spring Boot** that simplifies and automates the college admission process.  
Students can submit admission forms online and track the status of their applications. Admins can efficiently manage applications, approve or reject submissions, and monitor the admission process.

This portal aims to reduce manual work, improve operational efficiency, and provide a seamless experience for students and administrators.

## 🔑 Key Features

- **Student Module**
  - Register and create a student account
  - Fill admission forms with personal and academic details
  - Track application status: Pending, Approved, Rejected
  - Print or download submitted forms

- **Admin Module**
  - Secure admin login
  - View all student applications in a dashboard
  - Approve or reject student applications
  - Search and filter student applications efficiently


- **Reporting**
  - Generate reports on admissions, pending forms, and application statistics

## 💻 Technology Stack

### Backend
- **Java 17**: Programming language
- **Spring Boot 2.7**: Backend framework
- **Spring Data JPA**: Database ORM
- **Thymeleaf**: Template engine for dynamic web pages

### Frontend
- **HTML5/CSS3**: Structure and styling
- **Bootstrap 5**: Responsive UI framework
- **JavaScript/jQuery**: Dynamic client-side interactivity

### Database
- **MySQL**: Relational database for storing student and admin data

### Tools & Build
- **Maven**: Dependency management and build tool
- **Git**: Version control

## 🔧 Installation

### Prerequisites
- Java JDK 17+
- Maven
- MySQL Server
- IDE (Eclipse, IntelliJ IDEA, or VS Code)

### Step-by-Step Installation

1. **Clone the repository**
```bash
git clone https://github.com/Yashaswinideore/Student-Admission-Portal.git
cd Student-Admission-Portal

College-Admission-Portal/
│
├─ src/main/java/com/collegeadmission/
│   ├─ controller/        # Handles HTTP requests for students and admin
│   ├─ model/             # Entity classes for Student and Admin
│   ├─ repository/        # Interfaces for CRUD operations on the database
│   └─ service/           # Business logic for student registration, forms, and admin actions
│
├─ src/main/resources/
│   ├─ templates/         # Thymeleaf HTML pages
│   ├─ static/            # CSS, JS, images
│   └─ application.properties
│
├─ pom.xml                # Maven dependencies
└─ README.md
