# form과 button 관계

```
<form>
	<button type="submit"></button>
</form>
```
* 위와 같이 form 태그에 포함된 버튼의 기본타입은 submit이다.

* button type 이 `submit` 인 경우 form 태그에 포함된 input의 값을 무조건 서보로 전송하는 이벤트가 발생

* 만약 button을 클릭했을 때 JS 코드를 사용하여 상황을 제어하고 싶으면
button의 타입을 `button`으로 설정한다.

* 타입 `reset`은 `input`의 `value`를 제거


## password 암호화 하기
*spring-security-core 가져오기
```
<dependency>
	<groupId>org.springframework.security</groupId>
	<artifactId>spring-security-core</artifactId>
	<version>5.3.13.RELEASE</version>
</dependency>
```
* spring/appServlet/security-context.xml 파일

```
<bean id="passwordEncoder" class = "org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder">
	<constructor-arg index="0" value="4" />
</bean>
```

