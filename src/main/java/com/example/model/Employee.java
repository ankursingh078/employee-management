package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    private String empName;

    private String designation;

    private Double salary;

    @Column(name = "joining_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date joiningDate;

}
