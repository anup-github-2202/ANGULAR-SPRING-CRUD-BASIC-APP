package net.javaguides.springboot.controller;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

//    @PreAuthorize("hasAuthority('read-1')")
    @GetMapping("/hello-for-read")
    public String helloForReadUser() {
        return "Hello!";
    }
}