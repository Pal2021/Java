package DateAndTime;

import java.time.LocalDateTime;

public class DateTimeformater {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println("Today date and time:-"+now);
        System.out.println("Tomorrow date:-"+now.plusDays(1));
        DateTimeformater formet=DateTimeformater.ofPattern("dd-MM-yyyy mm:hh:ss");
        String formatDateTime=now.format(format);
        System.out.println(formatDateTime);
    }
}
