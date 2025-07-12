package com.jpmc.fetchdatapublishqueue.controller;

import com.jpmc.fetchdatapublishqueue.service.TravelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travelNumber")
public class TravelController {

    private final TravelService travelServiceproducer;

    public TravelController(TravelService travelServiceproducer) {
        this.travelServiceproducer = travelServiceproducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishPnrs() {
        travelServiceproducer.sendPnrsToKafka();
        return ResponseEntity.ok("PNRs published to Kafka");
    }
}
    