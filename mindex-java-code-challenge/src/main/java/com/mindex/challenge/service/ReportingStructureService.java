package com.mindex.challenge.service;

/**
 * Reporting Structure Service interface just to create one REST method read(GET)
 */


import com.mindex.challenge.data.ReportingStructure;
public interface ReportingStructureService {
    ReportingStructure read(String id);
}
