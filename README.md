# Todo App
## This is a simple Spring Boot project that allows creating users and assigning  todos to each user. 
### All requests were tested using Postman, and the data is stored in PostgreSQL database.

## Technologies used
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok


## Create User
### Request

POST http://localhost:8080/users
### Body:
    {
        "username":"kia",   
        "password":"k123@"
    }

### Response
    {
        "userId": 1,
        "username": "kia"
    }

### Request
POST http://localhost:8080/users

### Body
    {
        "username":"ali",
        "password":"al24#"
    }

### Response
    {
        "userId": 2,
        "username": "ali"
    }

### Request
POST http://localhost:8080/users

### Body
    {
        "username":"maria",
        "password":"marii1#"
    }
### Response
    {
        "userId": 3,
        "username": "maria"
    }

## Create Todo (POST /users/{id}/todos)

### Request
POST http://localhost:8080/users/1/todos
###
    {
        "title":"Buy milk",
        "description":"2 liters of milk",
        "priority":"MEDIUM"
    }
### Response
    {
        "todoId": 1,
        "title": "Buy milk",
        "description": "2 liters of milk",
        "priority": "MEDIUM",
        "completed": false
    }
### Request
POST http://localhost:8080/users/1/todos
###
    {
        "title":"Java Course",
        "description":"I should review and practice.. ",
        "priority":"HIGH"
    }
### Response
    {
            "todoId": 2,
            "title": "Java Course",
            "description": "I should review and practice.. ",
            "priority": "HIGH",
            "completed": false
        }
I also created some additionals todos for users in the same way.


## GET All Todos of a User  (GET /users/{userId}/todos)
### for userId 1:
### Request
GET http://localhost:8080/users/1/todos
### Response
    [
        {
            "todoId": 1,
            "title": "Buy milk",
            "description": "2 liters of milk",
            "priority": "MEDIUM",
            "completed": false
        },
        {
            "todoId": 2,
            "title": "Java Course",
            "description": "I should review and practice.. ",
            "priority": "HIGH",
            "completed": false
        }
    ]


### for userId 3:
### Request
GET http://localhost:8080/users/3/todos
### Response
    [
        {
            "todoId": 4,
            "title": "Go to gym",
            "description": "leg day workout ",
            "priority": "LOW",
            "completed": false
        },
        {
            "todoId": 5,
            "title": "plan weekend trip",
            "description": "Search for a nearby city, book a hotel ",
            "priority": "MEDIUM",
            "completed": false
        }
    ]





