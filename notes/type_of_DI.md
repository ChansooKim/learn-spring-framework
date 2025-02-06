# Dependency Injections Types
***
- 생성자 기반 주입 (Constructor-based):
  `Dependencies are set by creating the Bean using its Constructor`
  생성자 기반 주입은 @Autowired를 추가하지 않아도 의존성으로 생성자를 생성한다
``` java
@Component  
class YourBusinessClass{  
    Dependency1 dependency1;  
    Dependency2 dependency2;  
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {  
        super();  
        System.out.println("Constructor Injection - YourBusinessClass ");  
        this.dependency1 = dependency1;  
        this.dependency2 = dependency2;  
    }  
    public String toString() {  
        return "Using "+dependency1+" and "+dependency2;  
    }  
}
@Component  
class Dependency1{ .. }  
@Component  
class Dependency2{ .. }
```
- 수정자 기반 주입 (Setter-based)
  `Dependencies are set by calling setter methods on your beans`
``` java
@Component  
class YourBusinessClass{  
    Dependency1 dependency1;  
    Dependency2 dependency2;  
    @Autowired  
    public void setDependency1(Dependency1 dependency1) {  
        System.out.println("Setter Injection - setDependency1 ");  
        this.dependency1 = dependency1;  
    }  
    @Autowired  
    public void setDependency2(Dependency2 dependency2) {  
        System.out.println("Setter Injection - setDependency2 ");  
        this.dependency2 = dependency2;  
    }  
    public String toString() {  
        return "Using "+dependency1+" and "+dependency2;  
    }  
}
@Component  
class Dependency1{ .. }  
@Component  
class Dependency2{ .. }
```

- 필드 주입 (Field-based)
  `No setter or constructor. Dependency is injected using reflection`
  생성자나 수정자가 없음. 의존성은 리플렉션을 사용하여 주입됨
``` java
@Component  
class YourBusinessClass{  
    @Autowired  
    Dependency1 dependency1;  
    @Autowired  
    Dependency2 dependency2;  
    public String toString() {  
        return "Using "+dependency1+" and "+dependency2;  
    }  
}  
@Component  
class Dependency1{ .. }  
@Component  
class Dependency2{ .. }
```

**Spring은 생성자 기반 주입을 권장한다.**
-> 모든 초기화가 하나의 메소드에서 발생하기 때문 (초기화가 완료되면 Bean을 사용할 준비가 된 것)