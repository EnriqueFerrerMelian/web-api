# Web API
![sblogo](https://github.com/user-attachments/assets/d7aea1d1-fc57-4cc5-bc0b-c371c7659a50)
![intelogo](https://github.com/user-attachments/assets/15dc6082-4b0f-451c-8b07-ae9f34481895)

## 📝 Description
This is a small application that manages race records using Spring Boot in IntelliJ IDEA. The project is based on a tutorial made by
[Dan Vega](https://github.com/danvega).

## 🌟 What we've done!
  * The application loads data from a JSON file and stores it in an in-memory database using the H2 dependency.
  * The data is not permanent, but is set to load every time we start the application.
  * You can access the database from the browser at http://localhost:8080/h2-console.
  * For testing, I use Postman.

## 🛠 Prerequisites
Make sure you have the following items installed before you begin:
1. Java Fundamentals (Beginner - Intermediate)
2. JDK 17+
3. Java Build Tools (Maven/Gradle)
4. IDE / Text Editor: IntelliJ IDEA
5. API Testing Tool: Postman

## Instalation
1. Clone this repository to your local machine: git clone https://github.com/EnriqueFerrerMelian/YourRepoName.git
2. Open the project in IntelliJ IDEA.
3. Make sure you have JDK 17+ installed and configured in your IDE.
4. Run the application using the Maven or Gradle command depending on the build system you use:
   ./mvnw spring-boot:run
   ./gradlew bootRun
5. Accede a la base de datos en memoria desde http://localhost:8080/h2-console.

## 🐛 Problems
I've had some problems trying to include a database in the process. I tried using PostgreSQL, but IntelliJ IDEA couldn't access it. Configuration for PostgreSQL is not included in this repository.

## 📄 License
This project is licensed under the MIT License. For details, see the LICENSE.md file. (TBH, I don't think there is any license here).

## 📧 Contact
If you have any questions or comments, please feel free to contact us at progranauta@gmail.com I can get hurtful comments, but please, these ones must to be avoided!
