package hu.iit.uni.miskolc.advanced.java;

import hu.iit.uni.miskolc.advanced.java.service.PrimeService;
import hu.iit.uni.miskolc.advanced.java.service.PrimeServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        PrimeService service = new PrimeServiceImpl();
    }
}
