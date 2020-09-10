package personSample.model;

import java.time.LocalDate;

public class Person {
    private  int personID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(int personID, String firstName, String lastName, LocalDate birthDate) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getPersonID() {
        return personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
