package br.com.siecola.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ControllerTest {
    private static final Logger LOG = LoggerFactory.getLogger(ControllerTest.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name){
        LOG.info("Test controller - name: {}", name);
//teste
        return ResponseEntity.ok("name: " + name);
    }
}
