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
       Scanner choice = new Scanner(System.in);
       System.out.println("1. Add Book \n" +
               "2. Check Available Books");
       int select = Integer.parseInt(choice.nextLine());
        
       switch (select){
           case 1:
               Books lib = new Books();
               lib.add_book();
               break;
           case 2:
           Books lab = new Books();
               lab.check_book();
              break;
           default:
               System.out.println("Wrong Input");
               break;
       }

      } else {
          System.out.println("check your details correctly");
      }

  }}



