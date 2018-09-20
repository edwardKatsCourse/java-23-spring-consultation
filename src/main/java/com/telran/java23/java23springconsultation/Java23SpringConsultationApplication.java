package com.telran.java23.java23springconsultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Java23SpringConsultationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java23SpringConsultationApplication.class, args);
    }
}

@Component
class ConsoleRunner implements CommandLineRunner {
    //@Controller -> @Service -> @Service    -> RestTemplate("http://.... ")
    //                        -> @Repository -> Database (SQL)


    @Autowired
    private ComponentExample componentExample;

    @Override
    public void run(String... args) throws Exception {
        //Object instance = clazz.newInstance()
        //Map<String, Object> beans = new HashMap<>();
        //beans.get(componentExample);


        System.out.println("Scenario 1");
        new ComponentExample().printFilename();

        System.out.println();
        System.out.println("Scenario 2: by Spring Framework");
        componentExample.printFilename();

    }
}



@Component
//@Service
//@Repository
//@Controller
//@RestController

//@Configuration
class ComponentExample {
    //Stereotypes

//    @Autowired
//    private RestTemplate restTemplate;

//    @Bean
//    public RestTemplate helloBean() {
//        RestTemplate restTemplate = new RestTemplate();
        //?cityId=15&countryId=Israel
//        restTemplate.setInterceptors();

//        return restTemplate;
//    }

    //${} -> expression language
    @Value("${file.name}")
    private String filename;

    public void printFilename() {
        System.out.println(filename);
    }

}