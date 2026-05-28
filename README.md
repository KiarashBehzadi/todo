POST http://localhost:8080/users

{
    "username":"kia",
    "password":"k123@"
}
Result:
{
    "userId": 1,
    "username": "kia"
}


POST http://localhost:8080/users
{
    "username":"ali",
    "password":"al24#"
}
Result:
{
    "userId": 2,
    "username": "ali"
}

POST http://localhost:8080/users
{
    "username":"maria",
    "password":"marii1#"
}
Result:
{
    "userId": 3,
    "username": "maria"
}



GET POST http://localhost:8080/users
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



GET http://localhost:8080/users/3/todos
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





