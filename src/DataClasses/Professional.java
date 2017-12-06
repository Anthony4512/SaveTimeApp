package DataClasses;

import java.sql.Time;
import java.util.Date;
import java.util.Random;

public class Professional extends Client
{
    private String businessName;
    private int businessPhoneNumber;
    private String businessAddress;
    private Time freeTime;
    private boolean isFree;

    public Professional(String firstName, String lastName, String userName, String ID, Date date, Date dob, String email, String address, String city, String state, String zipCode, String country, String phoneNumber) {
        super(firstName, lastName, userName, ID, date, dob, email, address, city, state, zipCode, country, phoneNumber);
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Professional{" +
                "businessName='" + businessName + '\'' +
                ", businessPhoneNumber=" + businessPhoneNumber +
                ", businessAddress='" + businessAddress + '\'' +
                '}';
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    public int getBusinessPhoneNumber()
    {
        return businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(int businessPhoneNumber)
    {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public String getBusinessAddress()
    {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress)
    {
        this.businessAddress = businessAddress;
    }

    public Time getFreeTime()
    {
        return freeTime;
    }

    public void setFreeTime(Time freeTime)
    {
        this.freeTime = freeTime;
    }

    public boolean isFree()
    {
        return isFree;
    }

    public void setFree(boolean free)
    {
        isFree = free;
    }

    public boolean acceptAppointment(Appointment appointment)
    {
        Random random = new Random();
        int randNumber = random.nextInt(1000)+1;
        boolean isAccepted = false;
        if(this.isFree()) {
//            appointment.setAccepted(true);
            appointment.setAppointmentNum(randNumber);
            isAccepted = true;
        }
        return isAccepted;
    }


}
