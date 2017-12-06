package DataClasses;

import java.sql.Time;
import java.util.Date;

public class Appointment
{
    private boolean accepted;
    private boolean canceled;
    private String appointmentName;
    private Client client;
    private Professional professional;
    private Date date;
    private Time timeStart;
    private Time timeStop;
    private int appointmentNum;


    public Appointment(boolean accepted, boolean canceled, String appointmentName, Date date, Time timeStart, Time timeStop, int appointmentNum,
                       int professionalPhoneNum, int clientPhoneNum)
    {
        this.accepted = accepted;
        this.canceled = canceled;
        this.appointmentName = appointmentName;
        this.date = date;
        this.timeStart = timeStart;
        this.timeStop = timeStop;
        this.appointmentNum = appointmentNum;

    }

    public Appointment(Date appDate)
    {
        accepted = false;
        canceled = false;
        setAppointmentName("Fake appointment");
//        this.timeStart.setTime(appDate.getTime());
        date = appDate;
        appointmentNum = -1;

    }

    @Override

    public String toString()
    {
        String appString = (!this.isCanceled() ? "appointment{" +
                "accepted=" + accepted +
                ", canceled=" + canceled +
                ", appointmentName='" + appointmentName + '\'' +
                ", date=" + date.toString() +
                ", timeStart=" + timeStart +
//                ", timeStop=" + timeStop +
                ", appointmentNum=" + appointmentNum +
                '}' : "Appointment has been canceled or deleted");

        return appString;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public Professional getProfessional()
    {
        return professional;
    }

    public void setProfessional(Professional professional)
    {
        this.professional = professional;
    }

    public boolean isAccepted()
    {
        return accepted;
    }

    public void setAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }

    public boolean isCanceled()
    {
        return canceled;
    }

    public void setCanceled(boolean canceled)
    {
        this.canceled = canceled;
    }

    public String getAppointmentName()
    {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName)
    {
        this.appointmentName = appointmentName;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Time getTimeStart()
    {
        return timeStart;
    }

    public void setTimeStart(Time timeStart)
    {
        this.timeStart = timeStart;
    }

    public Time getTimeStop()
    {
        return timeStop;
    }

    public void setTimeStop(Time timeStop)
    {
        this.timeStop = timeStop;
    }

    public int getAppointmentNum()
    {
        return appointmentNum;
    }

    public void setAppointmentNum(int appointmentNum)
    {
        this.appointmentNum = appointmentNum;
    }

}