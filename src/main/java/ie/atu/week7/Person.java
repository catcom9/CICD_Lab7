package ie.atu.week7;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persons")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String employeeId;
    private String position;
    private String department;

    public Person() {
    }



    public Person(String name, String email, String employeeId, String position, String department) {
        this.name = name;
        this.email = email;
        this.employeeId = employeeId;
        this.position = position;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}