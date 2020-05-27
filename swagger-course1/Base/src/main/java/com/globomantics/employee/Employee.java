package com.globomantics.employee;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;
    public String title;
    @NotNull
    public String department;

    protected Employee() {
    }

    public Employee(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }
}
