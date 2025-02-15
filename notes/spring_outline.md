# Spring 개요
***
- Spring 프레임워크에는 Spring 모듈이 여러 개 포함되어 있다.
    - Core: 핵심 기능인 IoC 컨테이너, 의존성 주입, 자동 연결 등
    - Web: 웹 애플리케이션이나 REST API를 빌드할 때 Spring MVC 사용
    - Web Reactive: Spring WebFlux 등 사용
    - Data Access: JDBC, JPA 등
    - Integration: Spring JMS 등
    - Testing: Mock 객체, Spring MVC Test 등
- Spring 프레임워크가 모듈로 나뉘어져 있는 이유
    - 각 애플리케이션 마다 요구 사항은 다르고, 각 애플리케이션은 다양한 모듈을 사용한다.
    - 애플리케이션에서 Spring의 모든 기능을 사용해야 하는 게 아니기 때문에, 원하는 대로 고르고 선택하면 된다.

애플리케이션 아키텍처는 지속적으로 발전한다
`웹(Web)` → `REST API` → `마이크로서비스(Microservices)` → `클라우드(Cloud)` → ...

Spring은 다양한 **Spring 프로젝트**를 통해 발전한다
***

| 프로젝트                                            | 설명                                      |
| ----------------------------------------------- | --------------------------------------- |
| **First Project (첫 번째 프로젝트): Spring Framework** | Spring의 핵심 기반 프레임워크                     |
| **Spring Security (스프링 시큐리티)**                  | 웹 애플리케이션 또는 REST API 및 마이크로서비스 보안 기능 제공 |
| **Spring Data (스프링 데이터)**                       | NoSQL 및 관계형 데이터베이스와 동일한 방식으로 통합 지원      |
| **Spring Integration (스프링 통합)**                 | 다른 애플리케이션과의 통합 문제 해결                    |
| **Spring Boot (스프링 부트)**                        | 마이크로서비스 구축을 위한 인기 있는 프레임워크              |
| **Spring Cloud (스프링 클라우드)**                     | 클라우드 네이티브 애플리케이션 구축 지원                  |

Spring 프로젝트는 **웹 개발, 보안, 데이터 처리, 마이크로서비스 및 클라우드 네이티브 앱 구축** 등 다양한 애플리케이션 요구사항을 지원하는 강력한 도구이다.


Spring 계층 구조 (Hierarchy)
- **Spring Projects** > **Spring Framework** > **Spring Modules**

Spring 생태계(Ecosystem)가 인기 있는 이유

| 특징                                       | 설명                                                           |
| ---------------------------------------- | ------------------------------------------------------------ |
| **Loose Coupling (느슨한 결합)**              | Spring이 빈(Bean) 생성 및 의존성 연결을 관리함                             |
|                                          | - 느슨하게 결합된 애플리케이션 구축이 용이                                     |
|                                          | - 단위 테스트 작성이 용이 (Spring Unit Testing)                        |
| **Reduced Boilerplate Code (반복 코드 감소)**  | 비즈니스 로직에 집중할 수 있도록 단순화                                       |
|                                          | - 예외 처리(Exception Handling)를 메서드마다 작성할 필요 없음                 |
|                                          | - 모든 Checked Exception은 Runtime 또는 Unchecked Exception으로 변환됨 |
| **Architectural Flexibility (유연한 아키텍처)** | 필요에 따라 Spring 모듈 및 프로젝트를 선택해 사용 가능                           |
|                                          | - 모든 모듈을 사용할 필요 없이 필요한 것만 골라 사용                              |
| **Evolution with Time (시간에 따른 발전)**      | 마이크로서비스 및 클라우드 환경에 맞춰 발전                                     |
|                                          | - 대표 예: `Spring Boot`, `Spring Cloud`                        |

---

Spring 구성요소
- **Spring Projects:** Spring의 다양한 프로젝트 집합
- **Spring Framework:** Spring의 핵심 기능 (Core, MVC, JDBC, Test 등)
- **Spring Modules:** 필요한 모듈만 선택해 사용할 수 있는 유연함 제공


Spring은 느슨한 결합, 반복 코드 감소, 아키텍처 유연성 및 클라우드 시대에 맞는 진화를 통해 강력한 생태계를 구축하였다.
