package com.westernacher.training

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = SpockTrainingApplication)
class SpringTests extends Specification {
    @Autowired
    private String sampleBean;

    void contextLoads() {
        expect:
        sampleBean == 'Hello World!';
    }

}
