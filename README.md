# springboot-actuator-demo1 [![Build Status](https://travis-ci.org/origoni/springboot-actuator-demo1.svg?branch=master)](https://travis-ci.org/origoni/springboot-actuator-demo1)

springboot-actuator-demo1
with spring-boot-admin

## Reference

https://spring.io/guides/gs/actuator-service/
https://github.com/codecentric/spring-boot-admin
http://codecentric.github.io/spring-boot-admin/2.0.0/

## Quick Start

- JDK 1.8
- Maven 3.5
- Git

```
git clone https://github.com/origoni/springboot-actuator-demo1.git
cd springboot-actuator-demo1
mvn spring-boot:run
```

## Test

http://localhost:9000/admin/


### Tested
- STS(Eclipse) 3.8.4
- IntelliJ IDEA 2018.1.3

```
//@formatter:off & //@formatter:on
eclipse : Preferences -> Java -> Code style -> Formatter -> Edit... (or New...) > Off/On Tags
intellij : Preferences -> Editor -> Code Style > Formatter Control > Enable formatter markers in comments
```


## Dependency

### Spring Boot 2.0.2.RELEASE
- spring-boot-starter-webflux
- spring-boot-starter-actuator
- spring-boot-admin-starter-server
- spring-boot-admin-starter-client

### Using Jolokia for JMX over HTTP
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.jolokia</groupId>
    <artifactId>jolokia-core</artifactId>
</dependency>
```
