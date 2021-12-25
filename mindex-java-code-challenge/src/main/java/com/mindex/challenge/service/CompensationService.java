package com.mindex.challenge.service;

/**
 * Compensation service interface for creating the REST API services of create(POST) and read(GET)
 */





import com.mindex.challenge.data.Compensation;

public interface CompensationService {
    Compensation create(Compensation compensation);
    Compensation read(String id);
}
