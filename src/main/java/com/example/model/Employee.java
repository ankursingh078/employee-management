package com.example.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
