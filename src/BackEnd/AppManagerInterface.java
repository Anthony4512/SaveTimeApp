package BackEnd;

import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;


interface AppManagerInterface
{
    /**
     * sends a request to the professional to create an appointment
//     * @param professional that is going to accept or deny the appointment
//     * @param client that is requesting appointment
//     * @param timeOfAppointment the time requested by the client --> deleted
//     * @param dateOfAppointment the date requested by the client --> deleted
     * @return true if created, false otherwise
     */
    Appointment requestAppointment(Professional professional, Client client);


    /**
     * Deletes the appointment and notify users of the change
//     * @param professional to be notified, can also delete the appointment
//     * @param client to be notified
//     * @param appointment to be deleted
     * @return true if deleted, false otherwise
     */
    boolean deleteAppointment(Appointment appointment);


    /**
     * accept the appointment
     * @param professional the one the accepts the appointment
     * @param appointment the appointment to be created
     * @return returns the appointment number
     */
    int acceptAppointment(Professional professional, Appointment appointment);


    /**
     * denies the requested appointment
     * @param appointment to be denied
     * @return true if denied, false otherwise
     */
//    boolean denyAppointment(Appointment appointment);


    /**
     * update the appointment, notifies the client and the professional
     * @param appointment to be updated
     * @return true if updated,  false otherwise
     */
    Appointment updateAppointment(Appointment appointment);




}
