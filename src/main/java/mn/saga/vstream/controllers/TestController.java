package mn.saga.vstream.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
//@RequestMapping("/api")
public class TestController {


    @GetMapping("api/principal")
    public Principal user(Principal principal) {
        return principal;
    }
    @GetMapping("api/hello")
    public String hello() {
        return "Hello World";
    }

}