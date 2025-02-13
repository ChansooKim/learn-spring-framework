# XML Configuration
***
Java 어노테이션의 도입으로 현재는 잘 사용되지는 않으나
xml configuration을 사용하려면 아래와 같이 하나 하나 등록을 시켜줘야 함

``` xml
<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
       xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="  
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->  
  
    <bean id="name" class="java.lang.String">  
        <constructor-arg value="Ranga"  />  
    </bean>  
  
    <bean id="age" class="java.lang.String">  
        <constructor-arg value="35"  />  
    </bean>  
  
<!--    <context:component-scan  
            base-package="com.csk.learnspringframework.game"/>-->    <bean id="game" class="com.csk.learnspringframework.game.PacmanGame"/>  
    <bean id="gameRunner"  
          class="com.csk.learnspringframework.game.GameRunner">  
        <constructor-arg ref="game"/>  
    </bean>  
</beans>
```

``` java
public class XmlConfigurationLauncherApplication {  
    public static void main(String[] args) {  
        try(var context  
            = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {  
  
            Arrays.stream(context.getBeanDefinitionNames())  
                    .forEach(System.out::println);  
            System.out.println(context.getBean("name"));  
            System.out.println(context.getBean("age"));  
            context.getBean(GameRunner.class).run();  
        }  
    }  
}
```


## Annotations vs XML Configuration
|         | Annotations                                    | XML Configuration                                            |
| ------- | ---------------------------------------------- | ------------------------------------------------------------ |
| 사용 난이도  | 매우 쉬움<br>짧고 간결함                                | 길고 번거로움                                                      |
| POJO    | Spring 프레임워크를 참조<br>깔끔한 Java POJO가 아님          | Java 코드를 바꿀 필요 없어<br>POJO가 깔끔해짐                              |
| 유지보수    | 매우 쉬움                                          | 번거로움<br>(클래스 이름을 변경하거나<br>패키지 경로를 바꾸는 경우 XML에도<br>업데이트가 필요함) |
| 사용 빈도   | 대부분의 프로젝트에서 사용                                 | 거의 사용되지 않음                                                   |
| 디버깅 난이도 | 어려움<br>어노테이션을 사용하며<br>문제 발생 시 Spring에 대한 이해 필요 | 일반적인 난이도                                                     |
