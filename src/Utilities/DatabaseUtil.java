package Utilities;

import DataClasses.Appointment;
import DataClasses.Professional;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class DatabaseUtil implements DatabaseUtilInterface
{

    @Override
    public List<Professional> getNearbyProfessionals(int zipCode)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(int appointmentNumber)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(Date appointmentDate, Time appointmentTime)
    {
        return null;
    }
}
