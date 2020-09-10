package jpa.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pracownicy")
@NamedQueries({
        @NamedQuery(name = Employee.BY_FIRST_NAME, query = "select e from Employee e where e.firstName = :firstName"),
        @NamedQuery(name = Employee.BY_LAST_NAME, query = "select e from Employee e where e.lastName = ?1")
})
public class Employee {
    public static final String BY_FIRST_NAME = "byFirstName";
    public static final String BY_LAST_NAME = "byLastName";
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_pracownika")
    private int employeeId;
    @Column(name = "imie")
    private String firstName;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "wiek")
    private int age;

    @Temporal(TemporalType.DATE)
    private java.util.Date d1;
    @Temporal(TemporalType.TIME)
    private java.util.Date t1;
    @Temporal(TemporalType.TIMESTAMP)
    private Date t2;                   /// java Util Date



//    private Date d1;
//    private Time t1;                  /// java sql Date
//    private Timestamp t2;  // dzialaja z baza sql


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
