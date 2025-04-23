package user;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}
