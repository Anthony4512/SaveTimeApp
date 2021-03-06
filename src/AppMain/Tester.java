package AppMain;

import BackEnd.AppManager;
import DataClasses.Appointment;
import DataClasses.Client;
import DataClasses.Professional;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Tester
{
    void run()
    {
        Date CurrentDay = new Date();

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date DOB = null;

        Date appDate = null;

        Time startTime = null;
        Time endTime = null;

        try {
            DOB = format.parse("08/11/1986");
            appDate = format.parse("12/12/2017");
        } catch (ParseException e) {
            e.printStackTrace();
        }
//
//
//        System.out.println("hello world");
//        System.out.println("Executed with no problems");
//
//
        Client client1 = new Client("Jose", "Calderon", "jcalderon", "00",
                CurrentDay, DOB, "jcalderon@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "9788353117");
//
        Professional professional1 = new Professional("Manuel","Castro", "mcastro", "01",
                CurrentDay,DOB, "mcastro@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "9788357788");
//
////        Appointment appointment = new Appointment(true, false, "mcastro", );
//
//        Appointment clientRequestedApp = client1.requestAppointment(professional1, appDate, startTime, endTime);
//
//        System.out.println(clientRequestedApp.getTimeStart());
//        System.out.println(clientRequestedApp.getTimeStop());
//
//
//
//        System.out.println(client1.getDob().toString());
//        System.out.println(professional1.getDate().toString());


        //TESTING REQUEST APPOINTMENT

        AppManager manager = new AppManager();

        professional1.setFree(true);

        Appointment appointment = manager.requestAppointment(professional1, client1);
//        appointment.setAccepted(true);
//        appointment.setAppointmentNum(1234);
        System.out.println("Before accepted: " + appointment.toString());

        //END REQUEST APPOINTMENT


        //TESTING ACCEPT APPOINTMENT

        int appointmentAcceptedNumber = manager.acceptAppointment(professional1, appointment);

        System.out.println("After accepted: " + appointment.toString());


        manager.updateAppointment(appointment);


        System.out.println("after appointment has been updated to new time: " + appointment.toString());



        manager.deleteAppointment(appointment);

        System.out.println(appointment.toString());




    }
}
