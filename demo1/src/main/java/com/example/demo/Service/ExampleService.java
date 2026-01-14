package com.example.demo.service;

import com.example.demo.dto.ExampleRequest;
import com.example.demo.dto.ExampleResponse;

public interface ExampleService {
    ExampleResponse process(ExampleRequest request);
}