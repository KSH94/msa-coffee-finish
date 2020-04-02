//package com.example.msa.service;
//
//import com.example.msa.repository.Status;
//import com.example.msa.repository.StatusRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//@RequiredArgsConstructor
//@Service
//public class StatusService {
//
//    private final StatusRepository statusRepository;
//
//    public Status selectCoffeeOrderStatus() {
//        return new Status(statusRepository.findById(id));
//    }
//
//}
