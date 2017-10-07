package DataClasses;

import java.util.Date;

public class Professional extends Client
{
    private String businessName;
    private int businessPhoneNumber;
    private String businessAddress;

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
}
