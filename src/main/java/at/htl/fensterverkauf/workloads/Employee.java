package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee{
    @Id
    int empNo;

    String firstName;
    String lastName;
    Double salary;
    int hours;

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
        return "Employee{" +
                "empNo=" + empNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", hours=" + hours +
                '}';
    }
}
