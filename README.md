# Movie Management

A simple Spring Boot REST API for managing movies, following the MVC architecture.

## Endpoints

| Method | URL       | Description          |
|--------|-----------|----------------------|
| GET    | `/movie`  | Retrieve all movies  |
| POST   | `/movie`  | Add a new movie      |

## Example Usage

### Get all movies

```bash
curl http://localhost:8080/movie
```

### Add a movie

```bash
curl -X POST http://localhost:8080/movie \
  -H "Content-Type: application/json" \
  -d '{"title":"Inception","genre":"Sci-Fi"}'
```

## Tech Stack

- Java 17
- Spring Boot 3.3.0
- Maven
- In-memory `List<Movie>` (no database)

## Build & Run

```bash
mvn spring-boot:run
```
