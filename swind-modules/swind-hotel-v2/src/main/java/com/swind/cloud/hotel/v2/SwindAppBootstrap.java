package com.swind.cloud.hotel.v2;

// import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
// import org.springframework.scheduling.annotation.EnableScheduling;
// import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.swind.cloud.hotel.v2.mapper")
public class SwindAppBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwindAppBootstrap.class).web(true).run(args);
    }

    // @Bean
    // public RestTemplate restTemplate(RestTemplateBuilder builder) {
    //     return builder.build();
    // }
}
