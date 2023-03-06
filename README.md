# Students Reporting System 
Students Reporting System  spring boot application


![student-report-management-system-1620319712-577](https://github.com/Suresh170411/SaleskenProject/blob/main/Images/Blue%20Pink%20Gradient%20Fashion%20Banner.png)

## About
Student Reporting System is able to perform all the CRUD based operation and can manage data to the database
hassle free.

## Features

- Student record can be registerd to the database
- User can see average percentage of whole class in a recent semester
- User can see average marks of Students in a particular subject
- User can see the top 2 student's average marks



## Technologies and Dependencies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- Devtools
- MySQL
- Lombok
- Maven

## Backend Design 
###  ER Diagram

![New Microsoft PowerPoint Presentation](https://i.postimg.cc/R0TwHxRJ/Screenshot-124.png)


##  Schema

![](https://i.postimg.cc/4yc0Z36h/Screenshot-120.png)


- Student table

![](https://i.postimg.cc/W44fz8mV/Screenshot-121.png)


- Database Schema

![](https://i.postimg.cc/BvyN60Q5/Screenshot-122.png)

<br></br>

## API Root and Endpoint

- Register one student entity to the database
- Method : POST
```
http://localhost:8888/students
```
- Get all the student from the database
- Method : GET
```
http://localhost:8888/students
```
- Get avarage marks of all students for semester 1
- Method : GET
```
http://localhost:8888/students/semester1
```

- Get avarage marks of all students for semester 2
- Method : GET
```
http://localhost:8888/students/semester2
```

- Find the avarage marks of top 2 students
- Method : GET
```
http://localhost:8888/students/top/2
```
