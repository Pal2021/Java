package DateAndTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class TimeZone {
    public static void main(String[] args) {
        Set<String> st = ZoneId.getAvailableZoneIds();
        int i = 1;
        for (String s : st) {
            ZoneId z = ZoneId.of(s);
            LocalDateTime dt = LocalDateTime.now(z);
            System.out.println(i + "\t" + z + "\t" + dt);
            i++;
        }
    }
}
