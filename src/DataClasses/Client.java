package DataClasses;

import java.util.Date;

public class Client extends Person
{

    public Client(String firstName, String lastName, String userName, String ID, Date date, Date dob, String email, String address, String city, String state, String zipCode, String country, String  phoneNumber) {
        super(firstName, lastName, userName, ID, date, dob, email, address, city, state, zipCode, country, phoneNumber);
    }
}
