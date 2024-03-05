# User Posts

# About the project
API aimed at managing posts and comments made by users using the non-relational MongoDB database

## Domain Model
![image](https://github.com/anaeliza12/workshop-spring-mongodb/assets/108037430/49c12b6e-91fd-4d68-ad4a-7e9c2f71b315)



# Software Architecture Pattern — Layered Architecture
![image](https://github.com/anaeliza12/workshop-spring-mongodb/assets/108037430/c4f37cde-c7da-4faf-abfb-0177acd3cd35)

# Routes

## Find User
Send a GET request to http://localhost:8080/users/{id} to find a user by ID

## Register User
Send a POST request to http://localhost:8080/users with UserDTO object in the Request Body to register a new user:


## Delete User
Send a DELETE request to http://localhost:8080/users/{id} to delete a user

## Update User
Send a PUT request to http://localhost:8080/users/{id} and a UserDTO object in the Request Body 

## Find Post 
Send a GET request to http://localhost:8080/users/{id}/posts to find the post of the corresponding ID

## Find posts
Send a GET request to http://localhost:8080/posts/{id} to find the post by their ID

## Find by title
Send a GET request to http://localhost:8080/posts/titlesearch to find a post by the title

# Find by fulsearch
Send a GET request to http://localhost:8080/posts/fullsearch to find a post that contains the given text


# JSON Format

```json
{
      "id": "1001",
      "name": "Maria Brown",
      "email": "maria@gmail.com",
      "posts": ["5001", "5010"]
}
{
      "id": "5001",
      "date": "2018-03-21",
      "title": "Partiu viagem",
      "body": "Vou viajar para São Paulo. Abraços!",
      "author": {
              "id": "1001",
              "name": "Maria Brown"
      },
      "comments": [
          {
                    "text": "Boa viagem mano!",
                    "date": "2018-03-21",
                    "author": {
                    "id": "1013",
                    "name": "Alex Green"
              }
        },
        {
              "text": "Aproveite!",
              "date": "2018-03-22",
              "author": {
              "id": "1027",
              "name": "Bob Grey"
                }
          }
    ]
}
```
# Testing with Postman  <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> 


# Used Technologies
## Back-end 
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Database
- MongoDB
  
# Autor

Ana Eliza Perobelli

https://www.linkedin.com/in/ana-eliza-perobelli/
