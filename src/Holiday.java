import java.time.LocalDate;

public class Holiday {
  private String name;
  private LocalDate date;

  public Holiday(String name, String date) {
    this.name = name;
    this.date = Handler.parseDate(date);
  }

  public String getName() {
    return name;
  }

  public LocalDate getDate() {
    return date;
  }

  public String getDateFormatted() {
    return Handler.formatDate(date);
  }
}
