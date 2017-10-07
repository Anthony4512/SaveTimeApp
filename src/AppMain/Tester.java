package AppMain;

import DataClasses.Client;
import DataClasses.Professional;
import java.util.Date;
public class Tester

{
    public void run()
    {
        Date date1 = new Date();
        Date date2 = new Date("08-11-1986");

        System.out.println("hello world");

        Client c1 = new Client("Jose", "Calderon", "jcalderon", "00",
                new Date(),new Date("08-11-1986"), "jcalderon@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "978-835-3117");
        Professional p1 = new Professional("Manuel","Castro", "mcastro", "01",
                new Date(),new Date("08-11-1990"), "mcastro@gmail.com", "100 Elliot st", "Haverhill", "MA", "01844",
                "USA", "978-835-7788");


    }

}
