package DataClasses;

import java.sql.Time;
import java.util.Date;

public class Appointment
{
    private boolean accepted ;
    private boolean canceled ;
    private String Username;
    private Date date;
    private Time timeStart;
    private Time timeStop;
    private int appointmentNum;
    private int professionalPhoneNum;
    private int clientPhoneNum;

    public Appointment()
    {

    }

    public Appointment(boolean accepted, boolean canceled, String username, Date date, Time timeStart, Time timeStop, int appointmentNum,
             int professionalPhoneNum, int clientPhoneNum)
    {
        this.accepted = accepted;
        this.canceled = canceled;
        Username = username;
        this.date = date;
        this.timeStart = timeStart;
        this.timeStop = timeStop;
        this.appointmentNum = appointmentNum;
        this.professionalPhoneNum = professionalPhoneNum;
        this.clientPhoneNum = clientPhoneNum;
    }

    @Override

    public String toString()
    {
        return "appointment{" +
                "accepted=" + accepted +
                ", canceled=" + canceled +
                ", Username='" + Username + '\'' +
                ", date=" + date +
                ", timeStart=" + timeStart +
                ", timeStop=" + timeStop +
                ", appointmentNum=" + appointmentNum +
                ", professionalPhoneNum=" + professionalPhoneNum +
                ", clientPhoneNum=" + clientPhoneNum +
                '}';
    }

    public boolean isAccepted()
    {
        return accepted;
    }

    public void setAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled)
    {
        this.canceled = canceled;
    }

    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String username)
    {
        Username = username;
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

    public int getProfessionalPhoneNum()
    {
        return professionalPhoneNum;
    }

    public void setProfessionalPhoneNum(int professionalPhoneNum)
    {
        this.professionalPhoneNum = professionalPhoneNum;
    }

    public int getClientPhoneNum()
    {
        return clientPhoneNum;
    }

    public void setClientPhoneNum(int clientPhoneNum)
    {
        this.clientPhoneNum = clientPhoneNum;
    }
}
