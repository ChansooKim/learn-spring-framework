# PostConstruct vs PreDestroy
***
@PostConstruct: 객체가 생성된 후 별도의 초기화 작업을 위해 실행하는 메소드위에 사용하는 어노테이션 (데이터베이스 등에서 데이터를 가져오려는 경우)
-> 의존성을 연결하는 대로 초기화 논리를 실행하려는 경우
@PreDestroy: 컨테이너에서 Bean이 삭제되기 전에 해야 할 작업이 있다면 메소드위에 사용하는 어노테이션 (활성화된 연결을 닫거나 하는 경우)
-> 애플리케이션 컨텍스트에서 삭제되기 전에 cleanup을 수행하려는 경우

``` java
@Component  
class SomeClass {  
    private SomeDependency someDependency;  
    public SomeClass(SomeDependency someDependency) {  
        super();  
        this.someDependency = someDependency;  
        System.out.println("All dependencies are ready!");  
    }  
    @PostConstruct  
    public void initialize() {  
        someDependency.getReady();  
    }  
  
    @PreDestroy  
    public void cleanup() {  
        System.out.println("Cleanup");  
    }  
}  
  
@Component  
class SomeDependency {  
    public void getReady() {  
        System.out.println("Some logic using SomeDependency");  
    }  
}
```