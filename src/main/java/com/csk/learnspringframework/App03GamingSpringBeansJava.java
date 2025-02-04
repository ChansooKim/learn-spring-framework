package com.csk.learnspringframework;

import com.csk.learnspringframework.game.GameRunner;
import com.csk.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeansJava {
    public static void main(String[] args) {
        try(var context
            = new AnnotationConfigApplicationContext
                (GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
