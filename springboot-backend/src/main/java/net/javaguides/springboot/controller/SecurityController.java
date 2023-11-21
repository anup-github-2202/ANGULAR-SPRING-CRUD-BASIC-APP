package net.javaguides.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class SecurityController {

    @GetMapping("/hello")
    public String hello() {

        var authenticatedObject = SecurityContextHolder.getContext().getAuthentication();
        return "Hello!";
    }

    @GetMapping("/hi")
    public String hello1() {

        var authenticatedObject = SecurityContextHolder.getContext().getAuthentication();
        return "Hi!";
    }

    @PreAuthorize("hasAuthority('read-1')")
    @GetMapping("/hello-for-read")
    public String helloForReadUser() {
        return "Hello!";
    }
}