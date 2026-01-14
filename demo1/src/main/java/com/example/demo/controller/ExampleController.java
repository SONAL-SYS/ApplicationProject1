package com.example.demo.controller;
import com.example.demo.dto.ExampleRequest;
import com.example.demo.dto.ExampleResponse;
import com.example.demo.service.ExampleService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ExampleResponse process(@Valid @RequestBody ExampleRequest request) {
        return exampleService.process(request);
    }
}