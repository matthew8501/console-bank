import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime dt = LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(), time.getHour(), time.getMinute(), time.getSecond());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = dt.format(fmt);
        System.out.println("Tu hom nay " + formatted + " ");
        System.out.println("Xin chao toi la Khanh, toi se bat dau thuc hien hoat dong hoc nay hang ngay");

    }
}
