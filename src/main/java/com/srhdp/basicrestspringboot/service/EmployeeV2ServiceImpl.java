package com.srhdp.basicrestspringboot.service;

import com.srhdp.basicrestspringboot.entity.EmployeeEntity;
import com.srhdp.basicrestspringboot.model.Employee;
import com.srhdp.basicrestspringboot.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null ||
                employee.getEmailId().isEmpty()) {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,entity);
        employeeRepository.save(entity);

        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}