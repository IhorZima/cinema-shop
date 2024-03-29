     Cinema-app - It's simple web application for registration and showing cinema session

---

    Functions:

- _Register a new user (POST /register);_
- _Authenticate (POST /login);_
- _Find a user by email (GET /users/by-email);_
- _Show all cinema halls (GET /cinema-halls);_
- _Show available sessions of a movie by date (GET /movies);_
- _Add cinema hall (POST /cinema-halls);_
- _Add movie (POST /movies);_
- _List of all movies (GET /movies);_
- _Add movie session (POST /movie-sessions);_
- _Update data of a movie session (PUT /movie-sessions);_
- _Delete a movie session (DELETE /movie-sessions);_
- _Put a ticket into shopping cart (PUT /shopping-carts/movie-sessions);_
- _Shopping cart contents (GET /shopping-carts/by-user);_
- _Complete order (POST /orders/complete);_
- _Show user's order history (GET /orders)._

---

    Used technologies

- _Java_ 11
- _JDBC_
- _MySql_ DB
- _Apache_ _TomCat_ `v 9.0.50`
- _Apache_ _Maven_
- _Hibernate_
- _Spring MVC_
- _Spring Core_
- _Security_

---

    How to use project

- Install MySql
- Configure db.properties file:
- Configure TomCat Server: `v 9.0.50` **if you want to change TomCat version, need changed dependency**
- You have too already register USERS:
  - _login: bob@i.com password: 1234 witch role "ADMIN"_
  - _login: john@i.com password: 1234 witch role "USER"_
