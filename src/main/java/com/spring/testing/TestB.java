package com.spring.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@DirtiesContext
@ActiveProfiles("test")
@ContextConfiguration(classes = TestConfig.class)
public class TestB extends TestA {

    @Override
    @Test
    public void sampleCall() {
        System.out.println("Test B Klass Method!!!") ;
    }
}
