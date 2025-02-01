package com.csk.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) { };
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        // name, age, address2
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")    // name을 통해 원하는 BeanName을 지정
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")    // name을 통해 원하는 BeanName을 지정
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }
}
