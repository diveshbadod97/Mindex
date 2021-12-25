package com.mindex.challenge.service.impl;

/**
 * Compensation Service Interface Implementation of the two REST API methods
 */


import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.dao.CompensationRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensationImpl implements CompensationService {
    private static final Logger LOG = LoggerFactory.getLogger(CompensationImpl.class);
    @Autowired
    private CompensationRepo compensationRepo;
    @Override
    public Compensation create(Compensation compensation) {
        LOG.debug("Creating Compensation [{}]", compensation);
        compensationRepo.insert(compensation);
        return compensation;
    }

    @Override
    public Compensation read(String id) {
        LOG.debug("Compensation Read [{}]", id);

        Compensation compensation = compensationRepo.employeeId(id);

        if (compensation == null){
            throw new RuntimeException(id + ": is invalid");
        }
        return compensation;
    }
}
