import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Books {
Scanner scann = new Scanner(System.in);

   System.out.println("Enter boooks to be stored");
   System.out.println("Enter Genre");
   String genre = scann.nextLine();
   System.out.println("Enter Bokk Name");
   String Book_name= scann.nextLine();
   bookss[] bookie = new bookss[]{new bookss(genre),new bookss(Book_name)};

        try {
          FileWriter  wri = new FileWriter("database.txt", true);
            wri.write("\n" + bookie[0] + " " + bookie[1]);
        } catch (IOException g) {
            g.fillInStackTrace();

    }
}

