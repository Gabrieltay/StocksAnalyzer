# Stocks Analyzer with GraphQL [![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

## Prerequisites
- Java 8 (Require a later version than 1.8.0_181, to include [JCE](https://www.oracle.com/technetwork/java/javase/downloads/jce-all-download-5170447.html) by default. Java 10 does not work)
- Gradle

## Build
```bash
$ ./gradlew build
```

## Run
This will start the MySQL service locally
```bash
$ docker-compose -f docker-compose.local.yml up
```

## Test
```bash
$ ./gradlew check
```

## Ktlint Format
```bash
$ ./gradlew ktlintFormat
```


# GraphQL
GraphQL and GraphiQL are servlets provided by GraphQL-spring-boot-starter dependencies. 

Access your GraphiQL [here](http://localhost:8080/graphiql)

To send a HTTP POST query request with content-type: application/graphql
```graphql
{
  human(id: "1000") {
    id
    name
  }
}
```



### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [GraphQL documentation](https://graphql.org/)
* [GraphQL Java](https://www.graphql-java.com/)