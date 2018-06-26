package hu.exercise.docker.EchoServer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoServer {

    @Value("${echoserver.environment:DefaultWorld}")
    private String environment;

    @GetMapping("/{echo}")
    public String echo(@PathVariable final String echo) {
        return echo  + " from " + environment;
    }
}
