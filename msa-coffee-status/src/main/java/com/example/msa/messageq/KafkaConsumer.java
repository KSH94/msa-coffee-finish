package com.example.msa.messageq;

import com.example.msa.repository.Status;
import com.example.msa.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    StatusRepository statusRepository;

    @KafkaListener(topics = "coffee")
    public void processMessage(String kafkaMessage){
        System.out.println("KafkaMessage: "  + kafkaMessage);

        Status status = new Status();
        status.setOrderHistory(kafkaMessage);
        System.out.println(status.getId());
        statusRepository.insertCoffeeOrderStatus(status);
    }

}
