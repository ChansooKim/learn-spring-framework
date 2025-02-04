## Java Bean, POJO, Spring Bean
***
#### POJO (Plain Old Java Object)
``` java
class Pojo{
	private String text;
	private int number;
	public String toString() {
		return text + ":" + number;
	}
}
public class SpringBeanVsJavaBean { 
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);
	}
}
```
모든 Java 객체는 POJO이다. (거의 모든 Java 클래스)

#### Java Bean
``` java
class JavaBean implements Serializable {    // EJB
	// 1: public no-arg constructor
	public JavaBean() { }
	private String text;
	private int number;
	// 2: getters and setters
	public String getText() {
		return text;
	}
	pulbic void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	pulbic void setNumber(int number) {
		this.number = number;
	}
}
public class SpringBeanVsJavaBean { 
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);
	}
}
```
Java Bean의 조건
1. public no-arg constructor
    - no-arg constructor: 인수가 없는 생성자
    - 기본 no-arg 생성자일 수도 있고, 명시적으로 만들 수도 있다.
2. getter와 setter가 있어야 한다.
3. Serializable

Spring 프레임워크에서 관리하는 것은 무엇이든 Spring Bean이 될 수 있다.


### 요약
> Java Bean: 세 가지 제약을 준수하는 클래스
1. public 기본 생성자와 no-arg 생성자를 가지며
2. getter와 setter 메서드를 사용하여 프로퍼티에 엑세스할 수 있고
3. Java Serializable을 구현한다

> POJO: 아무 제약이 없으며, 모든 Java 클래스는 생성하면 아무 제약도 없는 POJO가 된다

> Spring Bean: Spring이 관리하는 모든 Java 객체를 말한다
IoC Container가 관리하는 모든 객체는 Spring Bean이다


