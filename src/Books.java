import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class bookss {
  public String name;

  bookss(String name) {
    this.name = name;
  }

  public String toSring() {
    return name;
  }
}

public class Books {

  public void check_book() {
    // check if name exists
    try {
      File myobj = new File("books.txt");
      Scanner myreader = new Scanner(myobj);

      while (myreader.hasNextLine()) {

        String Book_name = myreader.nextLine();
        System.out.println(Book_name);
      }
    } catch (IOException h) {
      h.fillInStackTrace();
    }
  }

  public void add_book() {
    Scanner scann = new Scanner(System.in);
    System.out.println("Enter boooks to be stored");
    System.out.println("Enter Genre");
    String genre = scann.nextLine();
    System.out.println("Enter Bokk Name");
    String Book_name = scann.nextLine();
    bookss[] bookie = new bookss[] { new bookss(genre), new bookss(Book_name) };
    try {
      Path nami = Path.of("books.txt");
      String namm = Files.readString(nami);
      if (namm.contains(genre) & namm.contains(Book_name)) {
        System.out.println("already exists");
      } else {
        FileWriter myWriter = new FileWriter("books.txt", true);
        myWriter.write("\n" + bookie[0].name + " " + bookie[1].name);
        myWriter.close();
        System.out.println("Successful");
      }

    } catch (IOException f) {
      System.out.println("error");
      f.fillInStackTrace();
    }
  }

  public void Borrow() {
    Scanner scaon = new Scanner(System.in);
    System.out.println("enter name of book");
    String bakon = scaon.nextLine();
    try {
      Path move = Path.of("database.txt");
      String muvevu = Files.readString(move);
      if (muvevu.contains(bakon)) {
        // move to student database
        FileWriter win = new FileWriter("student.txt", true);
        win.write(bakon);
        win.close();
        muvevu.replace(bakon, "");
        System.out.println("Book have Been Borrowed");
      } else {
        System.out.println("Book Doesn't exist");
      }
    } catch (IOException s) {
      System.out.println("error");
      s.fillInStackTrace();
    }
  }

  public void Return() {
    Scanner scum = new Scanner(System.in);
    System.out.println("enter name of book to return");
    String ban = scum.nextLine();
    try {
      Path move = Path.of("student.txt");
      String muvevu = Files.readString(move);
      if (muvevu.contains(ban)) {
        // move to student database
        FileWriter win = new FileWriter("books.txt", true);
        win.write(ban);
        win.close();
        muvevu.replace(ban, "");
        System.out.println("Book have been returned");
      } else {
        System.out.println("Book Doesn't exist");
      }
    } catch (IOException s) {
      System.out.println("error");
      s.fillInStackTrace();
    }
  }
}
