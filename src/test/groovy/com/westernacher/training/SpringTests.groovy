package com.westernacher.training

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
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
