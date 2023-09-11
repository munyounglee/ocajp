import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class question34 {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
        System.out.println("dt = " + dt);

        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE)); // 2014-07-31
    }
}
