# Spring 주요 어노테이션 요약
***

| 어노테이션               | 설명 |
|-------------------------|-----|
| `@Configuration`         | 클래스가 하나 이상의 `@Bean` 메서드를 선언하며, Spring 컨테이너에 의해 빈 정의로 처리됨 |
| `@ComponentScan`         | 컴포넌트를 검색할 특정 패키지를 정의. 특정 패키지가 없으면 이 어노테이션이 선언된 클래스의 패키지에서 검색 수행 |
| `@Bean`                  | 메서드가 Spring 컨테이너에서 관리할 빈을 생성함을 표시 |
| `@Component`             | 클래스가 Spring의 "컴포넌트"임을 표시 |
| `@Service`               | `@Component`의 특수화로, 비즈니스 로직을 포함하는 클래스임을 표시 |
| `@Controller`            | `@Component`의 특수화로, 웹 컨트롤러(예: REST API)를 정의함 |
| `@Repository`            | `@Component`의 특수화로, 데이터베이스 접근 및 조작을 담당하는 클래스임을 표시 |


| 어노테이션               | 설명 |
|-------------------------|-----|
| `@Primary`              | 다중 후보 중에서 단일 값 의존성을 `@Autowired`할 때 우선순위를 부여함 |
| `@Qualifier`            | `@Autowired` 시 후보 빈을 구별하기 위해 필드나 파라미터에 사용 |
| `@Lazy`                 | 해당 빈을 지연 초기화하도록 지정.`@Lazy`가 없으면 즉시 초기화됨 |
| `@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)` | 빈을 프로토타입으로 정의하여 매번 새로운 인스턴스를 생성. 기본은 싱글톤(IOC 컨테이너당 1개 인스턴스) |


| 어노테이션               | 설명                                                                     |
|-------------------------|------------------------------------------------------------------------|
| `@PostConstruct`        | 의존성 주입 후 초기화 작업을 위해 실행할 메서드를 지정                                        |
| `@PreDestroy`           | 컨테이너에서 제거되기 전에 호출될 콜백 메서드를 지정. 보통 특정한 Bean에서 보유하고 있는 자원을 해제하는 데 사용     |
| `@Named`                | Jakarta Contexts & Dependency Injection (CDI) 어노테이션으로, `@Component`와 유사 |
| `@Inject`               | Jakarta Contexts & Dependency Injection (CDI) 어노테이션으로, `@Autowired`와 유사 |
***

- @Primary는 매우 일반적이다. 우선 순위를 지정하는 역할만 할 수 있다.
- @Qualifier는 모든 컴포넌트에 한정자를 추가할 수 있고 자동 연결 시 한정자를 사용할 수 있다.