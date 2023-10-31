import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


       String hello = "hello Welcome to my library";
       System.out.println(hello);
       Scanner choice = new Scanner(System.in);
       System.out.println("1. LOG IN AS LIBRARIAN \n" +
               "2. LOG IN AS STUDENT");
       int select = Integer.parseInt(choice.nextLine());

       switch (select){
           case 1:
               System.out.println("Login as a Librarian");
               librarian lib = new librarian();
               lib.log_in_librarian();
               break;
           case 2:
              System.out.println("Login as a Student");
               student stu = new student();
               stu.start();
              break;
           default:
               System.out.println("Wrong Input");
               break;
       }

    }
}