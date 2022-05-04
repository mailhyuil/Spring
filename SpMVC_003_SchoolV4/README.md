# Spring Mybatis Project
* SpringMVC Project와 Oracle, MySQL 등 DBMS와 연동하는 Project

## Dependency 설정
### spring-jdbc
* spring-jdbc는 spring-webmvc와 버전을 일치 시켜야 한다.
```
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-jdbc</artifactId>
	<version>${org.springframework-version}</version>
</dependency>
```
### mybatis
```
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.9</version>
</dependency>

```
### mybatis-spring
```
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>2.0.7</version>
</dependency>
```
### commons-dbcp2
```
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.9.0</version>
</dependency>
```
### ojdbc8 또는 mysql-connector/j
* ojdbc8
```
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc8</artifactId>
    <version>21.5.0.0</version>
</dependency>
```
* mysql은 dbms버전에 따라 다른 connector를 사용한다
* 5.7.x는 5.x.x를 사용하고 8.x.x는 8.0.29사용
```

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>

```