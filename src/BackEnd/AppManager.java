package BackEnd;

import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;

public class AppManager implements AppManagerInterface
{

    @Override
    public boolean requestAppointment(Professional professional, Client client, Appointment appointment)
    {
        return false;
    }

    @Override
    public boolean deleteAppointment(Professional professional, Client client, Appointment appointment)
    {
        return false;
    }

    @Override
    public int acceptAppointment(Professional professional, Appointment appointment)
    {
        return 0;
    }

    @Override
    public boolean denyAppointment(Appointment appointment)
    {
        return false;
    }

    @Override
    public boolean updateAppointment(Appointment appointment)
    {
        return false;
    }
}
