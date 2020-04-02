package com.example.msa.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatusRepository {
    void insertCoffeeOrderStatus(Status status);
    List<Status> findAll();
}
