package Utilities;

import DataClasses.Appointment;
import DataClasses.Professional;

import java.sql.Time;
import java.util.Date;
import java.util.List;

interface DatabaseUtilInterface
{
    List<Professional> getNearbyProfessionals(int zipCode);

    Appointment getAppointment(int appointmentNumber);

    Appointment getAppointment(Date appointmentDate, Time appointmentTime);





}
