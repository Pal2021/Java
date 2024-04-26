import java.sql.Date;
import java.text.DateFormat;

public class datetime {
    // Create DateFormat instance with default style and locale
    DateFormat fr = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, Locale.getDefault());

    // Get current date
    Date currdate = new Date();

    // Format current date as string
    String time = String.format("%tF %<tT", currdate);

    // Print time with location (but locate is not defined)
    System.out.println(time + " in particular location " + "your_location_here");

    public static void main(String[] args){
        // Create an instance of the datetime class
        datetime dt = new datetime();
        // Define the locate variable and assign it a value
        String locate = "New York";

// Create an instance of the datetime class
    //datetime dt = new datetime();

// Print the time in the specified location
      System.out.println(dt.time + " in " + locate);
    }
}

