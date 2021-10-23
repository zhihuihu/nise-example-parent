package com.github.nise.example;

import com.github.nise.i18n.autoconfigure.ValidatorConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * swagger地址 http://localhost:8080/swagger-ui/#/
 * @author 86183
 */
@SpringBootApplication
//@Import(value = {ValidatorConfiguration.class})
public class NiseExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiseExampleApplication.class, args);
    }

}
