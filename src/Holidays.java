import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Holidays {
  final List<Holiday> holidays = new ArrayList<>(
      List.of(
          new Holiday("Confraternização mundial", "01/01/2023"),
          new Holiday("Tiradentes", "21/04/2023"),
          new Holiday("Páscoa", "17/04/2023"),
          new Holiday("Dia do Trabalho", "01/05/2023"),
          new Holiday("Corpus Christi", "08/06/2023"),
          new Holiday("Independência do Brasil", "07/09/2023"),
          new Holiday("Nossa Senhora Aparecida", "12/10/2023"),
          new Holiday("Finados", "02/11/2023"),
          new Holiday("Proclamação da República", "15/11/2023"),
          new Holiday("Natal", "25/12/2023")));

  public String getHoliday(String date) {
    LocalDate localDate = Handler.parseDate(date);
    if (localDate == null) {
      return "Data inválida";
    }

    for (Holiday holiday : holidays) {
      if (holiday.getDate().equals(localDate)) {
        return holiday.getName();
      }
    }

    return "Feriado não encontrado";
  }

  public String listHolidays() {
    String holidaysList = "";

    for (Holiday holiday : holidays) {
      holidaysList += String.format(
          "%s - %s %n",
          holiday.getDateFormatted(),
          holiday.getName());
    }

    return holidaysList;
  }
}