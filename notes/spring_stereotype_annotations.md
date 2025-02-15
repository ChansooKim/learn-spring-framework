# Spring Stereotype Annotations
***
@Component: `제네릭 어노테이션`이며 모든 클래스에 적용 가능하다.
- 특정 클래스에 Spring Bean을 생성하려는 경우에 @Component를 사용할 수 있다.
- 모든 Spring Stereotype 어노테이션의 기초가 된다.
- @Service: 클래스에 비즈니스 로직이 있는 경우
- @Controller: 웹 컨트롤러와 같이 컨트롤러 클래스인 경우
    - 웹 애플리케이션과 REST API에서 컨트롤러를 정의하는 데 사용된다.
- @Repository: Bean이 데이터베이스와 통신하는 경우, 데이터를 저장하거나 검색하거나 조작하는 경우
    - 일반적으로 리포지토리 클래스에서 데이터베이스와의 상호작용을 수행한다.

위와 같은 경우 해당하지 않는 경우, 제네릭 어노테이션인 @Component를 사용한다.

>이러한 @Component, @Service, @Controller, @Repository 모두 스트레오 타입 어노테이션이라고 부른다.

1. 구체적인 어노테이션을 사용하면 프레임워크에 자신이 의도했던 바를 더 자세하게 나타낼 수 있다.
2. AOP(관점 지향 프로그래밍)를 사용하여 어노테이션을 감지하고 그 위에 부가적인 동작을 추가할 수 있다.