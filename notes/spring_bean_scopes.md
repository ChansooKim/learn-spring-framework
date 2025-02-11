# 일반클래스 vs 프로토타입 클래스
***
몇 번을 호출해도 해시코드가 같은 동일한 인스턴스를 가져온다
-> Spring에서 기본적으로 생성하는 Bean은 `Singleton`이기 때문이다.

> Bean을 참조할 때마다 매번 다른 인스턴스를 생성하고 싶은 경우엔, 프로토타입을 사용하면 된다.

싱글톤(Singleton):
Spring IoC 컨테이너 당 객체 인스턴스가 딱 하나이다.
프로토타입(Prototype):
Spring IoC 컨테이너 당 객체 인스턴스가 여러 개일 수 있다.
Spring 컨테이너에서 Bean을 요청할 때마다 특정한 Bean의 새 인스턴스를 생성한다.
리퀘스트 스코프(Request Scope):
HTTP 요청당 객체 인스턴스 하나가 생성된다.
세션 스코프(Session Scope):
사용자 HTTP 세션 당 객체 인스턴스 하나가 생성된다.
애플리케이션 스코프(Application Scope):
웹 애플리케이션 전체에 객체 인스턴스 하나가 생성된다.
웹소켓 스코프(Websocket Scope):
웹소켓 인스턴스당 객체 인스턴스 하나가 생성된다.


- Java Singleton(GoF) vs Spring Singleton
  Java 디자인패턴인 싱글톤과 Spring에서 사용하는 싱글톤은 차이가 있다.
    - Spring 싱글톤의 경우 Spring IoC 컨테이너당 객체 인스턴스가 하나
    - Java 싱글톤은 JVM 하나당 객체 인스턴스가 하나
    - JVM에 Spring IoC 컨테이너 여러 개를 실행하면 Spring 싱글톤은 Java 싱글톤과 달라짐
        - 보통은 JVM에 Spring IoC 컨테이너를 여러 개 실행하지는 않아서
          99.99%는 같지만, 유의해야 한다.

``` java
@Component  
class NormalClass { ... }  
  
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
@Component  
class PrototypeClass { ... }  
  
@Configuration  
@ComponentScan  
public class BeanScopesLauncherApplication {  
    public static void main(String[] args) {  
        try(var context  
            = new AnnotationConfigApplicationContext  
                (BeanScopesLauncherApplication.class)) {  
            System.out.println(context.getBean(NormalClass.class));  
            System.out.println(context.getBean(NormalClass.class));  
            System.out.println(context.getBean(NormalClass.class));  
            System.out.println(context.getBean(NormalClass.class));  
            System.out.println(context.getBean(NormalClass.class));  
            System.out.println(context.getBean(NormalClass.class));  
  
            System.out.println(context.getBean(PrototypeClass.class));  
            System.out.println(context.getBean(PrototypeClass.class));  
            System.out.println(context.getBean(PrototypeClass.class));  
            System.out.println(context.getBean(PrototypeClass.class));  
        }  
    }  
}
```

```
examples.e1.NormalClass@34f7cfd9
examples.e1.NormalClass@34f7cfd9
examples.e1.NormalClass@34f7cfd9
examples.e1.NormalClass@34f7cfd9
examples.e1.NormalClass@34f7cfd9
examples.e1.NormalClass@34f7cfd9
examples.e1.PrototypeClass@65f095f8
examples.e1.PrototypeClass@59af0466
examples.e1.PrototypeClass@3e6ef8ad
examples.e1.PrototypeClass@346d61be
```


### Prototype vs Singleton Bean Scope

|                 | Prototype                                             | Singleton                                                           |
|-----------------| ----------------------------------------------------- | ------------------------------------------------------------------- |
| 인스턴스            | Spring IoC 컨테이너당 여러개                                  | Spring IoC 컨테이너당 한 개                                                |
| Code Snippet    | @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE) | @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)<br>OR Default |
| 빈도              | 아주 드물게                                                | 99.99%                                                              |
