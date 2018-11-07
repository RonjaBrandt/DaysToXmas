import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
    public static void main(String[] args) {

        LocalDate toDay = LocalDate.now();
        LocalDate xmas = LocalDate.of(toDay.getYear(),12,24);
        Long daysLeft = toDay.until(xmas, ChronoUnit.DAYS);

        if(daysLeft <0){
            toDay.plusYears(1);
        }
        else {
            System.out.println(daysLeft.toString()+ " days left to Christmas");
        }
    }
}