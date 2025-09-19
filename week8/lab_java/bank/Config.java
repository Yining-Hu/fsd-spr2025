import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Config {
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/uuuu - HH:mm:ss");
    public static final LocalDateTime NOW = LocalDateTime.now();
    public static final Scanner IN = new Scanner(System.in);
}
