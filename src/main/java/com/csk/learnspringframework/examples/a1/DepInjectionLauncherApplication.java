package com.csk.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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

    /*@Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDependency1 ");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDependency2 ");
        this.dependency2 = dependency2;
    }*/

    public String toString() {
        return "Using "+dependency1+" and "+dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan  // 현재 패키지에서 자동으로 컴포넌트 스캔을 하기 때문에 명시적으로 패키지를 지정하지 않아도 됨
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context
            = new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
