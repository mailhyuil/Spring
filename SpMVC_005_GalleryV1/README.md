<<<<<<< HEAD
# Naver OpenAPI 연동
* API : Application Programming Interface
* 누군가가 개방해서 제공하는 서비스에 접속하여 데이터를 가져오거나, 내가 가지고 있는 데이터를 공개적으로 제공하는 것
* API 에는 유료, 무료공개 데이터가 있는데 보통 무료로 공개하는 데이터를 OpenAPI 라고 한다
* 우리 애플리케이션에서 적절한 도구를 사용하여 다른 컴퓨터의 애플리케이션에 데이터를 요청하고, 요청받은 컴퓨터의 애플리케이션에서는 데이터를 XML, JSON 형태로 응답하여 사용할수 있도록 되어있다.

* 도서검색, 영화검색, 뉴스검색을 만들어보자

## 도서검색
* 네이버에 도서검색을 요청하고 도서를 선택하여 MySQL DB 에 INSERT 하기

## OpenAPI 를 연동하여 애플리케이션 작성
1. 어떤 방식으로 요청을 하는가 : URL, ID, Security 정보 등이 필요하다
2. 어떤 방식으로 데이터를 응답하는가 : XML, JSON
3. 어떤 방식으로 데이터를 응답하는지 확인하여 VO 클래스를 제일먼저 작성한다
4. Java 의 어떤 도구를 사용하여 데이터를 받을 것인가

## Naver 에 도서 검색 데이터 요청절차
* naver 도서요청 URL 과 요청문자열을 연결하여 QueryString 을 만든다
* QueryString을 RestTemplate 도구를 사용하여 naver 에 요청을 보낸다.
* 그리고 결과를 NaverBookVO 객체를 통해서 받는다.
=======
# 이미지 파일을 갖는 게시판
* 이미지 겔러리 
* 이미지 파일 업로드 기능

## 이미지 파일 업로드를 위한 Dependency 설정하기
* Spring Framework 에서는 기본적으로 파일 업로드를 지원하지 않는다.
* 파일 업로드를 구현하기 위하여 별도의 Dependency 를 가져오기
* Apache 재단에서 제작한 파일 업로드 도구
```
<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
</dependency>
```
```
<!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
<dependency>
    <groupId>commons-fileupload</groupId>
    <artifactId>commons-fileupload</artifactId>
    <version>1.4</version>
</dependency>
```

## 파일 업로드를 위한 bean 설정
* 파일 업로드를 위한 bean 은 root-context.xml 에 작성한다
* root-context.xml 은 프로젝트 전반에서 component(Controller, Service, Dao) 와 함께 다양한 package 의 클래스들이 공통으로 사용할 bean 을 설정하는 부분 대표적인 부분이 파일 업로드와 관련된 bean 이다
* servlet-context.xml 은 주로 controller, service 와 관련된 bean 을 주로 설정한다.

* fileUploadResolver 설정
* fileUploadResolver 에는 동시에 업로드 할수 있는 파일의 크기를 지정해준다
* ```maxUploadSizePerFile``` : 한개의 파일 업로드 제한용량
* ```maxUploadSize``` : 여러개의 파일을 업로드 할때 전체 제한 용량

```
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	<property name="maxUploadSizePerFile" value="2000000"/>
	<property name="maxUploadSize" value="20000000"/>
</bean>
```
## Upload 를 위한 form 설정
```
<form method="POST" enctype="multipart/form-data">
```
* 파일 업로드를 하기 위해서는 form tag 의 method 를 반드시 POST로 설정해야 한다. 파일 첨부를 위해서는 method를 절대 GET으로 설정하면 안된다
* enctype 을 설정한다. 기본값은 text 를 업로드하는 형식으로 지정이 되는데 이 type 을 ```multipart/form-data```로 지정해 주어야 한다.

* 업로드할 파일을 선택하기 위하여 ```type=file``` 인 input tag를 설정해 준다
* type 이 file 인 tag 의 이름은 Controller 의 VO 매개변수의 변수 이름에 포함되지 않아야 한다.
```
<input type="file" name="file" accept="image/*">
```

## Controller method 설정
* Controller의 method 중 이미지를 수신할 곳에 파일 수신 매개변수 설정
* ```@RequestParam("file")``` : form 의 type이 file 인 input tag에 붙여진 name 속성값

* form 에서 file 이라는 input tag 에 담겨서 전달된 파일 관련 데이터를 받을 매개변수
```
@RequestParam("file")  MultipartFile file)
```







>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc


