package Utilities;

import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;

import java.sql.Time;
import java.util.Date;
import java.util.List;

interface DatabaseUtilInterface
{

    List<Professional> getProfessionals(String zipCode);

    Professional getProfessional(String professionalID);

    List<Professional> getProfessionals(Date appointmentDate);

    Appointment getAppointment(String appointmentNumber);

    Appointment getAppointment(Date appointmentDate, Time appointmentTime);

    boolean deleteAppointment(String appointmentNumber);

    Client getClient(String clientID);

    List<Client> getClients(Date appointmentDate);

}
