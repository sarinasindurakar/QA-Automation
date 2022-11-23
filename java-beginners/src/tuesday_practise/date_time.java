package tuesday_practise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_time {
    public static void main(String[] args) {
        /*
        LocalDateTime obj= LocalDateTime.now();
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println("The current date and time is"+obj);
        System.out.println("The current date is"+ date);
        System.out.println("The current time is"+ time);
*/
                LocalDateTime myDateObj = LocalDateTime.now();
                System.out.println("Before formatting: " + myDateObj);
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String formattedDate = myDateObj.format(myFormatObj);
                System.out.println("After formatting: " + formattedDate);
            }
        }


