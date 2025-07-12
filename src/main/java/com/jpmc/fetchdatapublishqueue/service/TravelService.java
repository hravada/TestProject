package com.jpmc.fetchdatapublishqueue.service;

import com.jpmc.fetchdatapublishqueue.entity.NgTravelUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
        private final KafkaTemplate<String, String> kafkaTemplate;
    private final NgTravelUserService ngTravelUserService;
        //private final TravelRepository travelRepository;

        @Value("${kafka.topic.pnr}")
        private String topic;

        public TravelService(KafkaTemplate<String, String> kafkaTemplate, NgTravelUserService ngTravelUserService) {
            this.kafkaTemplate = kafkaTemplate;
            this.ngTravelUserService = ngTravelUserService;
        }

        public void sendPnrsToKafka() {
            List<NgTravelUser> pnrs = ngTravelUserService.getUserList();
            pnrs.forEach(pnr -> {
                kafkaTemplate.send(topic, String.valueOf(pnr.getTravelNumber()));
                System.out.println("Sent to Kafka: " + pnr.getTravelNumber());
            });
        }
    }


