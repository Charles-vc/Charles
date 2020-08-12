package ll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class GovernServer {

    public static void main(String[] args) {
        SpringApplication.run(GovernServer.class, args);
    }

}
