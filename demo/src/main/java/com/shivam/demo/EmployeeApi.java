package com.shivam.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("/employee")
@RestController
public class EmployeeApi {

    @GetMapping("/{empId}")
    public String getEmployee(String empId)
    {
        return "Employee record found";
    }
}
