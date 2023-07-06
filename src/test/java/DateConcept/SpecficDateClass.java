package DateConcept;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpecficDateClass {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.of(2023,7,10,12,00,00);
        DateTimeFormatter ddt=DateTimeFormatter.ofPattern("YYYY-MMMM-dd h.mm.s");
        String formattedDateTime=ldt.format(ddt);
        System.out.println(formattedDateTime);
    }
}
