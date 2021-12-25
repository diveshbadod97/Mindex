package com.mindex.challenge.dao;

/**
 * Interface to access the Employee repo by EmployeeId
 */

import com.mindex.challenge.data.Compensation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompensationRepo extends MongoRepository<Compensation, String>{
    Compensation employeeId(String employeeId);
}
