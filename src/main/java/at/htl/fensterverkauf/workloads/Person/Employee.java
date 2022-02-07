package at.htl.fensterverkauf.workloads.Person;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empNo;

    private String firstName;
    private String lastName;
    private Double salary;
    private int hours;

    //region Constructor
    public Employee() {
    }

    public Employee(String firstName, String lastName, Double salary, int hours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hours = hours;
    }
    //endregion

    //region Getter & Setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    //endregion

    @Override
    public String toString() {
        return String.format("%s %s %d %d", firstName, lastName, salary, hours);
    }
}