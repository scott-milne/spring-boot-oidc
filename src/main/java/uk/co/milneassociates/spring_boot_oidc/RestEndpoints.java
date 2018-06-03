package uk.co.milneassociates.spring_boot_oidc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RestEndpoints {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
