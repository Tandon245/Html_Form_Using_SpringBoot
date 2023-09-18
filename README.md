# HTML Form Using Spring Boot

This is a simple Spring Boot web application that allows users to register by filling out a form. User data is then stored in an H2 in-memory database. This README.md file will guide you through setting up and using the project.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (at least Java 8).
- Maven installed to build and manage the project.
- A modern web browser to view and interact with the application.

## Getting Started

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/yourusername/Html_Form_Using_SpringBoot.git
 
Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

## Build the project using Maven:
```
   mvn clean install
```
## Run the application:
```
mvn spring-boot:run
```
The application should now be running at  

   http://localhost:8080/api

## Usage
Access the application by opening your web browser and navigating to http://localhost:8080/api.

You will see a user registration form.

Fill out the form with your details:

First Name
Last Name
Email
Date of Birth
Gender
Password
Click the "Submit Form" button to submit your registration.

You will be redirected to a confirmation page, indicating that your registration was successful.

To view the H2 in-memory database console, navigate to http://localhost:8080/h2-console. You can log in using the following credentials:

JDBC URL: jdbc:h2:mem:userdb
Username: tandon
Password: (choose any password you want)
To stop the application, press Ctrl+C in the terminal where it is running.

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix: git checkout -b feature/your-feature-name.
Make your changes and commit them: git commit -m 'Add some feature'.
Push to your branch: git push origin feature/your-feature-name.
Create a pull request.



Feel free to reach out if you have any questions or need assistance.

Thank you for considering contributing to this project! We look forward to your contributions.
