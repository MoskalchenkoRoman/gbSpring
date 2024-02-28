package com.example.dztotal;

import com.example.dztotal.model.MyProductFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyProductFactory productFactory(){
        return new MyProductFactory();
    }
}
