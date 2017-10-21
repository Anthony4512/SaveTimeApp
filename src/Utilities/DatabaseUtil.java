package Utilities;

import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class DatabaseUtil implements DatabaseUtilInterface
{

    @Override
    public List<Professional> getProfessionals(String zipCode)
    {
        return null;
    }

    @Override
    public Professional getProfessional(String professionalID)
    {
        return null;
    }

    @Override
    public List<Professional> getProfessionals(Date appointmentDate)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(String appointmentNumber)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(Date appointmentDate, Time appointmentTime)
    {
        return null;
    }

    @Override
    public Client getClient(String clientID)
    {
        return null;
    }

    @Override
    public List<Client> getClients(Date appointmentDate)
    {
        return null;
    }
}
