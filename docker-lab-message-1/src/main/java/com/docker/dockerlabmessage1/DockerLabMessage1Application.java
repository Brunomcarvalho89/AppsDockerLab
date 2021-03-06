package com.docker.dockerlabmessage1;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerLabMessage1Application {

    private static String uuidImage = UUID.randomUUID().toString();

    public static void main(String[] args) {
        SpringApplication.run(DockerLabMessage1Application.class, args);
    }

    @Value("${message.app:}")
    public String message;

    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.ok(this.message + " - " + uuidImage);
    }
}
