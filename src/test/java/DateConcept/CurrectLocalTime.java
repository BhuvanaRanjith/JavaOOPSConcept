package DateConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrectLocalTime {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        SimpleDateFormat sd=new SimpleDateFormat("MMMM/dd/YYYY hh:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));
        System.out.println(d.toString());

    }
}
