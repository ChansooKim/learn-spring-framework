# Dependency Injection (제어의 역전)
***
``` java
    public static void main(String[] args) {
		// 1: Object Creation
		var game = new PacmanGame();
        var gameRunner =  new GameRunner(game);
        // 2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        gameRunner.run();
    }
```
프로그래머가 명시적으로 코드를 작성해서 의존성을 통해 객체를 생성했다.
-> 프로그래머가 객체를 생성하고 제어하고 있다.




``` java
public static void main(String[] args) {  
    try(var context  
        = new AnnotationConfigApplicationContext  
            (DepInjectionLauncherApplication.class)) {  
        Arrays.stream(context.getBeanDefinitionNames())  
                .forEach(System.out::println);  
    }  
}
```
프로그래머는 컴포넌트 스캔을 정의하고 몇 개의 @Component를 정의했는데
객체를 생성하고 이 모두를 와이어링하는 실제 작업은 Spring 프레임워크가 수행한다.

제어권이 프로그래머, 또는 명시적인 코드 작성에서 Spring 프레임워크로 넘어간 것
-> 특정 어노테이션을 붙이면, Spring이 알아서 객체 생성을 하고 의존성을 주입해줌

