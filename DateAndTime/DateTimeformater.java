package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeformater {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Today date and time:-" + now);
        System.out.println("Tomorrow date:-" + now.plusDays(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println(formatDateTime);
    }
}
