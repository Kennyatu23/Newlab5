package ie.atu.lab5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients
@SpringBootApplication
public class Lab5Application {

    public static void main(String[] args) {SpringApplication.run(Lab5Application.class, args);}

    @Bean
    public RestTemplate restTemplate() { return new RestTemplate();}
}
