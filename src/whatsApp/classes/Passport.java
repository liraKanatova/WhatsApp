package whatsApp.classes;

import whatsApp.enums.City;
import whatsApp.enums.City;
import whatsApp.enums.Gender;

import java.time.LocalDate;

public class Passport {
    private int id;
    private String firstName,lastName;
    private LocalDate dateOfBirth;
    private City city;
    private Gender gender;

    public Passport(int id, String firstName, String lastName, LocalDate dateOfBirth, City city, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.city =city;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public City getCountry() {
        return city;
    }

    public void setCountry(City city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nassport{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city=" + city +
                ", gender=" + gender +
                '}';
    }
}
