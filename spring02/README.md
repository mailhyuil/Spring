# SpringMVC 패턴의 `Request`, `Response`
* web browser 의 주소창에 `http://localhost:8080/hello` 라고 입력 후 ENTER를 누르면 `http//localhost:8080` 에서 실행중인 TOMCAT에 요청이 전달된다
* TOMCAT에 의해 실행중인 `hello` 프로젝트에 다시 요청이 전달된다.
* 프로젝트에 `@Controller`가 설정된 Class를 찾는다.
* `@Controller Class` class의 메서드 중 `@RequestMapping`의 value가 `/`로 설정된 부분이 있는지 찾는다.
* request와 일치하는 `@RequestMapping` 을 찾으면 해당 메서드를 실행하여 결과를 web browser로 response한다.

## `@RequestMapping(value="/hello")`
* client 의 request를 받았을 때 적절한 코드를 실행할 메소드를 지정하는 Annotation
* `value` 속성에 request의 요청 key를 작성한다.

## `RequestMethod`
* web page에 form을 작성하여 데이터를 입력받고 서버로 전송을 하는 코드를 작성하는 경우 form tag에 `method="post"` 도는 `method="get"` 속성을 부여한다.
* fomr tag만 단독으로 작성할 경우 `method="get"`속성이 기본값으로 부여된다.
* `method="get"` 속성을 input box에 입력된 데이터가 주소표시줄에 노출되는 형태로 서버로 전송된다.
* 입력된 데이터가 주소표시줄에 노출되면 보안에 취약한 상황이 발생한다.
* 특별한 상황이 아니라면 `post` 속성을 사용하자.
* `method="post"` 속성을 

* form에서 `RequestMethod`를 구분해서 사용하면 `Controller`에서는 `RequestMethod`에 따라 다른 메소드를 실행하게 할 수 있다.