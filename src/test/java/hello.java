import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hello {
    @Test
    public void get(){
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println(d1Str);
        LocalDate d2 = LocalDate.now();
        DateTimeFormatter d23 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format1 = d2.format(d23);
        System.out.println(format1);
    }
}
