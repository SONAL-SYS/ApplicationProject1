package com.example.demo.service.impl;
import com.example.demo.dto.ExampleRequest;
import com.example.demo.dto.ExampleResponse;
import com.example.demo.service.ExampleService;
import com.example.demo.util.RequestIdGenerator;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleResponse process(ExampleRequest request) {
        // Placeholder for real business logic
        String requestId = RequestIdGenerator.generate();
        return new ExampleResponse("SUCCESS", requestId);
    }
}