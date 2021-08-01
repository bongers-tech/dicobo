package tech.bongers.dicobo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public User() {
        // No-args
    }

    public User(final String firstName, final String lastName, final String emailAddress) {
        this.id = new Random().nextLong();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
