package com.mindex.challenge.controller;

/**
 * Compensation Type controller for processing the REST API request in this case only READ is being processed
 */

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class CompensationController {
    private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);

    private CompensationService compensationService;
    @PostMapping("/compensation")
    public Compensation create(Compensation compensation){
        LOG.debug("Creating Compensation Request for [{}]", compensation);

        return compensationService.create(compensation);
    }
    @GetMapping("/compensation/{id}")
    public Compensation read(String id){
        LOG.debug("Reading Compensation for [{}]", id);
        return compensationService.read(id);
    }
}
