package BackEnd;

import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppManager implements AppManagerInterface
{

    @Override
    public Appointment requestAppointment(Professional professional, Client client)
    {

        //TODO let user to select what time he wants to set the appointment
        Date appDate = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm a");

        try {
            appDate = format.parse("12/12/2017 11:15 AM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Appointment appointment = new Appointment(appDate);
        appointment.setClient(client);
        appointment.setProfessional(professional);
        appointment.setTimeStart(new Time(appDate != null ? appDate.getTime() : 0));

        return appointment;
    }

    @Override
    public boolean deleteAppointment(Appointment appointment)
    {
        appointment.setCanceled(true);

        return true;
    }


    @Override
    public int acceptAppointment(Professional professional, Appointment appointment)
    {
        if(professional.acceptAppointment(appointment)) {
            appointment.setAccepted(true);
        }
        else {
            appointment.setAccepted(false);
        }

        return appointment.getAppointmentNum();
    }

//    @Override
//    public boolean denyAppointment(Appointment appointment)
//    {
//
//        return false;
//    }

    @Override
    public Appointment updateAppointment(Appointment appointment)
    {
        Appointment appointment1 = appointment;
        //TODO let user to select what time or date he wants to set the appointment
        Date appDate = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm a");

        try {
            appDate = format.parse("12/12/2017 12:15 AM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        appointment1.setDate(appDate);
        appointment1.setTimeStart(new Time(appDate != null ? appDate.getTime() : 0));

        return appointment1;
    }
}
