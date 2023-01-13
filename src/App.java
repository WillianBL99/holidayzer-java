import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Holidayzer\n");
    run();
  }

  private static void run() {
    Holidays holidays = new Holidays();

    while (true) {
      System.out.println(menu());
      int option = getOption();
      handleMenu(option, holidays);
    }
  }

  private static String header() {
    String header = "Holidayzer";
    String description = "Feriados brasileiros 2023";

    return String.format(
        "%n ### %s ### %n%s %n",
        header,
        description);
  }

  private static String menu() {
    return String.format(
        "%n ### Menu ###%n1 - %s%n2 - %s%n3 - %s%n",
        "Listar feriados",
        "Buscar feriado",
        "Sair");
  }

  private static void handleMenu(int opt, Holidays holidays) {

    switch (opt) {
      case 1:
        System.out.println(holidays.listHolidays());
        break;
      case 2:
        String date = getDateString();
        System.out.println(holidays.getHoliday(date));
        break;
      case 3:
        System.out.println("Saindo...");
        System.exit(0);
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }
  }

  private static int getOption() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma opção: ");
    return scanner.nextInt();
  }

  private static String getDateString() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma data: ");
    return scanner.nextLine();
  }
}
