# Cahoo Answers
![Status](https://img.shields.io/badge/status-work--in--progress-red)

A responsive webapp the allows users to post and answer question. Essentially a clone of the [deprecated Yahoo answers](https://help.yahoo.com/kb/SLN35642.html).


## Table of Content:
- [Cahoo Answers](#cahoo-answers)
  - [Table of Content:](#table-of-content)
    - [📜 Description:](#-description)
    - [🛠️ Tools Used:](#️-tools-used)
    - [🔖 References:](#-references)
    - [⚙️ Installation:](#️-installation)

### 📜 Description:

[User Story Map](/resources/usm.svg)


<p align="center"> <video src="https://user-images.githubusercontent.com/44941115/176813463-b7b1a895-5817-4542-a9b7-e0b570005d8a.mp4" controls="controls" /> </p>
<p align="center">
<sub>A slight peek at the progress so far.</sub>
</p>



### 🛠️ Tools Used:
- Java
- Typescript
- Spring boot
- Angular
- Angular Material
- Angular flex-box
- Junit
- TextUSM vscode extension



### 🔖 References:
- Learned to build a basic RESTful API and basic Spring concepts mostly through the [Spring official guides](https://spring.io/guides) and [Baeldung guides](https://www.baeldung.com/spring-tutorial#:~:text=we'll%20start%20with%20some%20core%20aspects%20of%20the%20framework%20first%3A).
- Got an idea on  how to leverage Spring Security Framework, and its classes for building features like registration and login from this [repository](https://github.com/amigoscode/login-registration-backend)


### ⚙️ Installation:

> Make sure to set up the psql database and edit the [application.yml](https://github.com/Kalaiz/cahoo-answers/blob/main/cahoo-backend/src/main/resources/application.yml) file prior to the below instructions.

- Under the cahoo-frontend folder, run `ng serve` for the frontend/client application.

- Under the cahoo-backend folder, run `mvn spring-boot:run` for the backend application.

- Note: Make sure the backend is running before running the frontend.  



