package com.example.msa.rest;

import com.example.msa.repository.Status;
import com.example.msa.repository.StatusRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StatusRestController {

    @Autowired
    StatusRepository statusRepository;

    @ApiOperation(value = "find all status")
    @GetMapping("/api/v1/status/")
    @HystrixCommand
    public List<Status> findAll() {
        return statusRepository.findAll();
    }
}
