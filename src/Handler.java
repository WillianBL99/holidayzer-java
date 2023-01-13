import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Handler {
  public static LocalDate parseDate(String date) {
    try {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
      return LocalDate.parse(date, formatter);
    } catch (Exception e) {
      System.err.println(date + " não é uma data válida");
      return null;
    }
  }

  public static String formatDate(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    return date.format(formatter);
  }
}
