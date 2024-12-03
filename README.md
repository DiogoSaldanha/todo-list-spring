# Todo List Spring Application
My name is Diogo and I am a Computer Science student working to improve my knowledge of the Spring Framework. This project is part of my studies to deepen my understanding of building web applications with Spring Boot. I hope to apply the skills I've learned to more complex and real-world applications in the future.
This is a simple Todo List application built using **Spring Boot**. It allows users to add, view, delete, and mark tasks as completed. The application is structured into multiple layers, including the controller, service, and model, to demonstrate common practices in Spring Boot application development.

## Features
- **Add tasks**: Users can add new tasks with descriptions.
- **View tasks**: Displays a list of tasks, showing whether they are completed or pending.
- **Delete tasks**: Tasks can be deleted from the list.
- **Mark tasks as completed**: Tasks can be marked as completed.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java 8+**: Ensure that you have Java 8 or a later version installed.
- **Maven**: The project uses Maven for dependency management. Make sure Maven is installed.
- **Spring Boot**: The project is built using Spring Boot.

## Getting Started

Follow these steps to set up the project locally on your machine:

### 1. Clone the Repository

Clone the repository to your local machine using Git:

```
git clone https://github.com/your-username/todo-list-spring.git
cd todo-list-spring
```

### 2. Build the Project

Use Maven to build the project. You can run this command from the root directory:

```
mvn clean install
```

### 3. Run the Application
To run the application locally, use the following Maven command:

```
mvn spring-boot:run
```


## Main Classes:

### TodoListSpringApplication.java
The entry point of the Spring Boot application, where the application starts running.

### Task.java (Model)
A simple model class that represents a Task with a description and a status (completed or pending).

### TodoListService.java (Service)
This service class manages the task list and provides methods to add, delete, view, and mark tasks as completed.

### TodoListController.java (Controller)
This controller class provides endpoints to get all tasks, add a new task, delete a task, and mark a task as completed.

## Contribution
Feel free to fork this repository and create a pull request if you'd like to contribute improvements or new features.

### Fork the repository.
### Create a new branch (git checkout -b feature-branch).
### Make your changes and commit them.
### Push to your forked repository (git push origin feature-branch).
### Open a pull request.
