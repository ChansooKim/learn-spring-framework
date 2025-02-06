# Spring 주요 용어
***
- @Component: @Component 어노테이션을 붙인 특정 클래스가 컴포넌트 스캔에 있다면, 해당 클래스의 인스턴스, 즉 Spring Bean이 생성되고 Spring 프레임워크에 의해 관리된다
- Dependency: `GameRunner`는 `GamingConsole`의 구현체가 필요하다.
  MarioGame은 GameRunner의 의존성이다.
- ComponentScan: @ComponentScan 어노테이션을 통해 컴포넌트가 있는 위치를 알려준다. 패키지 이름 없이 @ComponentScan 어노테이션을 추가하면, 현재 패키지가 스캔된다.
- Dependency Injection: 애플리케이션을 실행하면, Spring은 가장 먼저 컴포넌트 스캔을 수행한다. 모든 구성 요소를 찾고, 이 컴포넌트의 의존성이 무엇인지 식별하고 모두 와이어링 하게 된다.
    - Spring Bean: Spring 프레임워크가 관리하는 모든 객체
    - IoC Container: Bean의 생명 주기와 의존성을 관리하는 Spring 프레임워크의 컴포넌트
        - ApplicationContext: 더 많은 복잡한 기능(Enterprise)을 제공
        - Bean Factory: 더 간단한 기능을 제공 (잘 사용되지 않음)
    - Autowiring: Spring Bean에 대한 의존성의 와이어링 프로세스
      -> Qualifier와 같은 식별자를 통해 해당 클래스가 의존성이고, 해당 객체가 필요하다는 걸 인지하고 자동 주입해준다.