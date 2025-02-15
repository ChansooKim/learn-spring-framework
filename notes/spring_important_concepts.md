## Spring 주요 개념 요약
***
| 개념                     | 설명                                                               |
|-------------------------|------------------------------------------------------------------|
| **Dependency Injection (의존성 주입)** | 빈(Bean)과 그 의존성을 식별하고 서로 연결해주는 과정 (IoC - Inversion of Control 제공) |
| **Constructor injection (생성자 주입)** | 생성자를 통해 빈(Bean)의 의존성을 주입                                         |
| **Setter injection (세터 주입)** | 세터 메서드를 호출하여 빈(Bean)의 의존성을 주입                                    |
| **Field injection (필드 주입)** | 생성자나 세터 없이, 리플렉션(Reflection)을 사용해 의존성을 주입                        |
| **IOC Container (IOC 컨테이너)** | Spring의 IOC 컨텍스트로, 빈과 빈의 생명주기를 관리                                |
| **Bean Factory (빈 팩토리)** | 기본적인 Spring IOC 컨테이너                                             |
| **Application Context (애플리케이션 컨텍스트)** | 고급 Spring IOC 컨테이너로, 엔터프라이즈급 기능 제공. 웹 애플리케이션, 국제화, AOP 통합에 유리    |
| **Spring Beans (스프링 빈)** | Spring이 관리하는 객체                                                  |
| **Auto-wiring (자동 주입)** | Spring 빈의 의존성을 자동으로 연결해주는 과정                                     |
