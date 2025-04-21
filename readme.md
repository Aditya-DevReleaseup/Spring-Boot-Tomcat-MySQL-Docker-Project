✅ Features:

Spring Boot web application

MySQL database with Docker

Preloaded data (Alice and Bob)

Dockerfile with multi-stage build

docker-compose for service orchestration
Volumes for persistent storage and logs

📅 Project Structure

springboot-tomcat-app/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── logs/                         # Log volume (created at runtime)
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       ├── DemoApplication.java
│       │       ├── User.java
│       │       └── UserRepository.java
│       └── resources/
│           └── application.properties

🔧 Step-by-Step Instructions   
// Clone it or do it maual steps

1.mkdir springboot-tomcat-app && cd springboot-tomcat-app
2. Create pom.xml  / add data from my repo
3. Create  Java Code -> DemoApplication.java
4. Create User.java
5. Create UserRepository.java 
6 . Create application.properties
7 . Create  Dockerfile (multi-stage)
8. Create Docker Compose for Multi-Container App


🚀 Run the Application

Build and Run with Docker Compose
docker compose up --build
curl http://localhost:8080/users
output : --

[
  { "id": 1, "name": "Alice" },
  { "id": 2, "name": "Bob" }
]

Volumes for data and logs
./logs:/app/logs - For troubleshooting app logs
mysql-data:/var/lib/mysql - MySQL data persistence
