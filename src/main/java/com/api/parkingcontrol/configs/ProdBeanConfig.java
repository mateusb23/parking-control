package com.api.parkingcontrol.configs;

import com.api.parkingcontrol.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdBeanConfig {

    @Profile("prod")
    @Bean
    public MyBean myBeanProdProfile() {
        System.out.println("Profile PROD Started!");
        return new MyBean();
    }

}
