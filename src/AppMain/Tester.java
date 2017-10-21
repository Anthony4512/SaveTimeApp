package AppMain;

import DataClasses.Client;
import DataClasses.Professional;

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
        try {
            DOB = format.parse("08/11/1986");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println("hello world");
      
        System.out.println("Executed with no problems");


        Client client1 = new Client("Jose", "Calderon", "jcalderon", "00",
                CurrentDay, DOB, "jcalderon@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "978-835-3117");
        Professional professional1 = new Professional("Manuel","Castro", "mcastro", "01",
                CurrentDay,DOB, "mcastro@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "978-835-7788");


        System.out.println(client1.getDob().toString());
        System.out.println(professional1.getDate().toString());

    }
}
