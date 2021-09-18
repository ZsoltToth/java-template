package hu.iit.uni.miskolc.advanced.java;

import hu.iit.uni.miskolc.advanced.java.service.PrimeService;
import hu.iit.uni.miskolc.advanced.java.service.QuadraticSolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        PrimeService service = context.getBean(PrimeService.class);
        QuadraticSolver solver = context.getBean(QuadraticSolver.class);
        System.out.println(service.isPrime(5));

        Arrays.stream(solver.solve(1, -1, -6)).forEach(System.out::println);
    }
}
