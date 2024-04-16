package DateAndTime;  
import java.time.*;

public class date {
    public static void main(String args[]){
        LocalDate today = LocalDate.now();
        System.out.println("Today date: " + today);
        LocalDate tomorrow = today.plusDays(1); 
        System.out.println("tomorrow date: " + tomorrow);
        LocalDate yesterday = today.minusDays(1); 
        System.out.println("yesterday date: " + yesterday);   
        System.out.println("Is leap year :" +today.isLeapYear());     
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);
        LocalTime time=now.toLocalTime();
        System.out.println("Current Time: "+time);

        LocalTime time1=LocalTime.of(11,54,12);
        System.out.println(time1);
    }
}
