package DateConcept;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LocalTimetoGmT {
    public static void main(String[] args) {
        Date date=new Date();

        DateFormat gmtFor=new SimpleDateFormat();
        TimeZone gmt=TimeZone.getTimeZone("GMT");
        gmtFor.setTimeZone(gmt);
        System.out.println(date.toString());
        System.out.println(gmtFor.format(date));
    }
}
