package online.grisk.hefesto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.cfg.xml")
public class HefestoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HefestoApplication.class, args);
    }

}
