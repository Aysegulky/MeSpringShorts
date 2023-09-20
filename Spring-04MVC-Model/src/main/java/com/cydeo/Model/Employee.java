package com.cydeo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String FirstName;
    private String LastName;
    private Integer salary;
}
