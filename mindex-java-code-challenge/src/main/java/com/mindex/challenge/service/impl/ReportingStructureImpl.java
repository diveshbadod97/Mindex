package com.mindex.challenge.service.impl;

/**
 * Implementing the read method and calculating the number of reports the given employee id
 */




import com.mindex.challenge.data.Employee;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReportingStructureImpl implements ReportingStructureService {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureImpl.class);
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public ReportingStructure read(String id) {
        LOG.debug("Reading employee[{}]", id);

        Employee employee = employeeRepository.findByEmployeeId(id);
        ReportingStructure reportingStructure = new ReportingStructure();
        reportingStructure.setEmployee(id);
        int numberOfReports = 0;
        String directReports = null;
        if (employee.getDirectReports() != null){
            for (int i = 0; i < employee.getDirectReports().size(); i ++){
                directReports = employee.getDirectReports().get(i).getEmployeeId();
                numberOfReports++;
                if(employeeRepository.findByEmployeeId(directReports).getDirectReports() != null){
                    for(int j = 0; j < employeeRepository.findByEmployeeId(directReports).getDirectReports().size(); j ++){
                        numberOfReports++;
                    }
                }
            }
        }
        reportingStructure.setNumberOfreports(numberOfReports);
        return reportingStructure;
    }
}
