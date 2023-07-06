package DateConcept;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.AM_PM));
    }
}
