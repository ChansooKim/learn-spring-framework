package com.csk.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
