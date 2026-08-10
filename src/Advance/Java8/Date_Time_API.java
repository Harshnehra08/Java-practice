package Advance.Java8;
import java.time.*;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.LocalDateTime;

public class Date_Time_API {

        public static void main(String[] args) {

            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            LocalDateTime dt = LocalDateTime.now();

            System.out.println(date);
            System.out.println(time);
            System.out.println(dt);

        }

}
