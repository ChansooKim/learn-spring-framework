package com.csk.learnspringframework.examples.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {
    private DataService dataService;
    public BusinessCalculationService(@Qualifier("mongoDbDataService") DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }
}
