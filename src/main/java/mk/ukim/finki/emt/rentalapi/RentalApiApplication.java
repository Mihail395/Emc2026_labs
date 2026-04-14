package mk.ukim.finki.emt.rentalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RentalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalApiApplication.class, args);
    }

}
