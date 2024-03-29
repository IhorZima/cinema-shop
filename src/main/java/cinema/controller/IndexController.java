package cinema.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String getUser(Authentication authentication) {
        return String.format("Hello, %s!", authentication.getName());
    }
}
