# Spring Boot, React, MySQL, Docker Compose, and Traefik - To-Do App
- App UI: http://todo.localhost
- API: http://api.todo.localhost
  
## Run Locally

1. Clone:
    ```
    git clone https://github.com/Aditya-DevReleaseup/Spring-Boot-Tomcat-MySQL-Docker-Project.git
    cd Spring-Boot-Tomcat-MySQL-Docker-Project
    ```

2. Add in `/etc/hosts`:
    ```
    127.0.0.1  todo.localhost api.todo.localhost
    ```

3. Start all containers:
    ```
    docker compose up --build
    ```

- App UI: http://todo.localhost
- API: http://api.todo.localhost
- Traefik Dashboard: http://localhost:8081

### Notes

- Backend API routes start with `/api/...`
- All Dockerfiles, Compose, and Traefik logic here are ready for quick local development and production!
