## try-with-resources
***
`AutoCloseable` 인터페이스를 구현한 객체를 사용한 후 자동으로 `close()` 메서드를 호출하여 자원을 안전하게 해제할 수 있도록 돕는 구문이다.
주로 파일, 데이터베이스 연결, 네트워크 소켓, 그리고 `ApplicationContext`와 같은 리소스 관리에 사용됩니다.

#### 기본 구조
``` java
try (ResourceType resource = new ResourceType()) {
	// resource를 사용하는 코드
} catch (Exception e) {
	// 예외 처리
}
```

#### ApplicationContext에서의 사용
``` java
try(var context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {
	MyService service = context.getBean(MyService.class);
	service.doSomething();
}
```

##### 장점
1. **코드 간결성**: `finally` 블록 없이도 자동으로 자원이 해제된다.
2. **안전성**: 예외가 발생해도 `close()`가 호출되므로 리소스 누수를 방지할 수 있다.
3. **가독성 향상**: 불필요한 예외 처리 로직이 줄어든다.

##### 주의할 점
- `AutoCloseable` 또는 `Closeable` 인터페이스를 구현한 객체만 사용할 수 있다.
- 여러 리소스를 사용할 경우 `;`로 구분하여 선언한다.