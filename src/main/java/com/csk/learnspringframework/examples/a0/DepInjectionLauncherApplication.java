package com.csk.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan  // 현재 패키지에서 자동으로 컴포넌트 스캔을 하기 때문에 명시적으로 패키지를 지정하지 않아도 됨
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context
            = new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}