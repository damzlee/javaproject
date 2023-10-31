import java.util.Scanner;


public class librarian {
    String Username="librarian";
    String passkey= "5555";
  public void log_in_librarian() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your username Below");
      String username = scanner.next();
      System.out.println("Enter your 4 Digit Password");
      String passworddd = scanner.next();
      if (username.equals(Username) & passworddd.equals(passkey)) {
          System.out.println("You're logged in as a librarian");
      } else {
          System.out.println("check your details correctly");
      }

  }}



