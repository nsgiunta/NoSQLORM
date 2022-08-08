package co.develhope.NoSQLORM.entities;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String Id;

    private String firstName;
    private String lastName;

    public User(){};

    public User(String id, String firstName, String lastName) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
}
