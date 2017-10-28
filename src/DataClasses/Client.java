package DataClasses;

import java.sql.Time;
import java.util.Date;

public class Client extends Person
{

    public Client(String firstName, String lastName, String userName, String ID, Date date, Date dob, String email, String address, String city, String state, String zipCode, String country, String  phoneNumber) {
        super(firstName, lastName, userName, ID, date, dob, email, address, city, state, zipCode, country, phoneNumber);
    }

    public Appointment requestAppointment(Professional professional, Date date, Time timeStart, Time timeEnd) {
        Appointment requestedAppointment = new Appointment(false, false, this.userName, date, timeStart,
                timeEnd, 0, 0, 0);

        return requestedAppointment;
    }
}
