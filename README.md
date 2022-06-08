# p-maersk-demo

It's demo application to Insert/Update/Fetch movies. It's combination of Spring Boot & H2 to handle request and save records

# Applicaton Setup
> Software Requirements: <br />

JAVA 9+ <br />
apache-maven <br />
Eclipse with STS plugin or STS <br />
Postman for testing api <br />

> Build Application: <br />

Clone application from git repo: use master branch<br />
Import to your IDE <br />
Build the application from IDE or use command "mvn clean install" <br />
Run application in IDE: either run as Java application or Spring boot application from IDE <br />
Run using command line: "mvn spring-boot:run" <br />

# Insert Movies using below api

> URL: http://localhost:8080/movie <br />
> Method: POST <br />
> Example Body: <br />
````
{
    "name": "movie-1",
    "releaseYear": "2006",
    "rating": 2,
    "originalLanguage": "Kannada",
    "duration": 100,
    "thumbnailUrl": "http://thumbnail.com/movie-1"
}
````

# Update Movie using below api

> URL: http://localhost:8080/movie/1 <br />
> Method: PUT <br />
> Example Body: <br />
````
{
    "name": "moviee-1",
    "releaseYear": "2022",
    "rating": 2,
    "originalLanguage": "English",
    "duration": 100,
    "thumbnailUrl": "http://thumbnail.com/moviee-1"
}
````

# Fetch Movies using below api

> URL: http://localhost:8080/movies  - Fetch all movies <br />
> URL: http://localhost:8080/movies?year=2022  - Filter by both year <br />
> URL: http://localhost:8080/movies?rating=2  - Filter by rating <br />
> URL: http://localhost:8080/movies?year=2002&rating=4  - Filter by both year and rating <br />
> Method: GET
