# 결합도(Coupling)
***
> #### Spring Initializr
> Release Version
> - SNAPSHOT, RC 1, M1, M2, M3가 없는 것을 릴리즈 버전이라고 한다.
> ##### Etc
> - System.out.println을 사용하는 것보다는 로깅 프레임워크를 사용하는 것이 좋다.

## 강한 결합 (Tightly Coupled)
***
- 결합: 무언가를 변경하는 데 얼마나 많은 작업이 관련되어 있는지에 대한 측정
- 아래와 같은 경우에는 GameRunner 클래스가 특정 게임에 강하게 결합되어 있다고 볼 수 있다.

``` java
public class AppGamingBasicJava {
	public static void main(String[] args) {  
			var marioGame = new MarioGame();  
	        var gameRunner =  new GameRunner(marioGame);  
	        gameRunner.run();  
	}
}

public class GameRunner {  
    private MarioGame game;  
  
    public GameRunner(MarioGame game) {  
        this.game = game;  
    }  
  
    public void run() {  
        System.out.println("Running game: " + game);  
        game.up();  
        game.down();  
        game.left();  
        game.right();  
    }  
}

public class MarioGame {  
    public void up() {  
        System.out.println("Jump");  
    }  
  
    public void down() {  
        System.out.println("Go into a hole");  
    }  
  
    public void left() {  
        System.out.println("Go left");  
    }  
  
    public void right() {  
        System.out.println("Accelerate");  
    }  
}
```

마리오 게임 대신 다른 게임을 실행하려는 경우 특정 클래스에서 얼마나 많은 변화가 있어야 하는지
-> 이것을 측정하는 것이 `결합`이다.

결합은 훌륭한 소프트웨어를 구축하는 데 훨씬 중요하다.
기술에서 유일하게 변화하지 않는 것은 변화이다.
가능한 한 느슨한 결합을 사용해야 한다.
가능한 한 코드를 적게 변경하면서 기능을 변경할 수 있어야 한다.


## 느슨한 결합 (Loose Coupling)
***
- Interface를 사용하여 결합을 느슨하게 한다.

``` java
public class AppGamingBasicJava {  
    public static void main(String[] args) {  
//        var game = new MarioGame();  
//        var game = new SuperContraGame();  
        var game = new PacmanGame();  
        var gameRunner =  new GameRunner(game);  
        gameRunner.run();  
    }  
}

public interface GamingConsole {  
    void up();  
    void down();  
    void left();  
    void right();  
}

public class GameRunner {  
    private GamingConsole game;  
    public GameRunner(GamingConsole game) {  
        this.game = game;  
    }  
    public void run() {  
        System.out.println("Running game: " + game);  
        game.up();  
        game.down();  
        game.left();  
        game.right();  
    }  
}

public class PacmanGame implements GamingConsole{  
    @Override  
    public void up() {  
        System.out.println("up");  
    }  
    @Override  
    public void down() {  
        System.out.println("down");  
    }  
    @Override  
    public void left() {  
        System.out.println("left");  
    }  
    @Override  
    public void right() {  
        System.out.println("right");  
    }  
}
```
-> 소스코드를 최소한으로 변경하며 게임을 변경(`기능을 변경`)할 수 있다.