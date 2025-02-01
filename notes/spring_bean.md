# Spring Bean
***
## SpringFramework로 객체 생성 및 결합
애플리케이션을 실행하면 JVM이 시작되며 Spring Context를 생성한다

Spring이 관리해야 하는 것을 설정하는 데 사용할 수 있는 접근 방식 중 하나는 설정 클래스라는 것을 사용하는 것
-> @Configuration
설정 클래스를 사용하여 Spring 컨텍스트를 시작할 수 있다.

## SpringContext를 만드는 방법
- AnnotationConfigApplicationContext를 만드는데 `@Configuration`이 붙은 설정 클래스를 사용한다.
  `var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);`

## Bean
***
- 설정 클래스에서 `@Bean`을 붙이는 메서드를 정의하면, 이 메서드는 Bean을 생성하고 이 Bean은 Spring 컨테이너가 관리한다.
- @Bean을 붙인 메서드의 이름으로 `context.getBean("{methodName}")` Context를 가져올 수 있다.
- `context.getBean("name");`을 통해서 context를 실행시켜보면, name() 메서드가 실행되는 것을 확인할 수 있다.
  -> 이를 통해 Spring이 이 Bean을 관리하고 있는 것을 알 수 있다.
    - `getBean()`에서 Bean 메서드 명 대신, 클래스 유형을 통해 가져올 수도 있다.
        - `conetext.getBean(Address.class);`
- `@Bean(name = "{customBean}")`을 통해 Bean 이름을 지정할 수 있다.

### Record
***
- jdk 16에서 추가된 기능으로, Java Bean을 만드는 번거로움을 해결하기 위해 도입된 기능이다.
- 레코드를 사용하면 Setter, Getter, 생성자 등을 만들 필요가 없다.
    - 모두 자동으로 생성되기 때문

### 요약
> 1. Bean에 사용자 지정 이름을 설정할 수 있다.
> 2. 다양한 방법으로 Spring 컨텍스트에서 Bean을 검색할 수 있다.
  >    1. Bean 이름을 사용
   >    2. 클래스 이름의 형식을 사용
> 3. Spring에서 관리하는 기존 Bean을 사용하여 새 Bean을 만들 수 있다.
