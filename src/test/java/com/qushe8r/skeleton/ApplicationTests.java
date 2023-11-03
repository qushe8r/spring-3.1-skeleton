package com.qushe8r.skeleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println("bean = " + bean);
        }

        Assertions.assertThat(beans).isNotNull();
    }

}
