import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class student_login {
    public String name;

    student_login(String name) {
        this.name = name;
    }

    public String toSring() {
        return name;
    }
}

public class student {

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. Create Student Account \n" +
                " 2. LogIn As A Student ");
        int Cr = Integer.parseInt(scan.nextLine());
        switch (Cr) {
            case 1:
                create_account();
                break;
            case 2:
                log_in();
                break;
                case 3:
                Books bak = new Books();
                bak.check_book();
            default:
                System.out.println("Invalid Input");
        }
    }

    public void create_account() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 Digit MatricNumber Below");
        int Matric = scanner.nextInt();
        System.out.println("Create 4 Digit Password");
        int password = scanner.nextInt();
        System.out.println("account created" + " " + Matric + " " + password);
        // convert detail to string because my array accepts strings only
        String matric = String.valueOf(Matric);
        String pass = String.valueOf(password);
        // attach to array
        student_login[] login = new student_login[] { new student_login(matric), new student_login(pass) };
        // write to database
        try {
            Path name = Path.of("database.txt");
            String names = Files.readString(name);
            if (names.contains(matric) & names.contains(pass)) {
                System.out.println("you've an account Already existing Just login below");
                log_in();
            } else {
                FileWriter myWriter = new FileWriter("database.txt", true);
                myWriter.write("\n" + login[0].name + " " + login[1].name);
                myWriter.close();
                System.out.println("Successful");
            }

        } catch (IOException e) {
            System.out.println("error");
            e.fillInStackTrace();
        }
        // go to login_
        log_in();
    }

    public void log_in() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 Digit MatricNumber Below");
        int Matricc = scanner.nextInt();
        System.out.println("Enter 4 Digit Password");
        int passwordd = scanner.nextInt();
        String Matwick = String.valueOf(Matricc);
        String pasword = String.valueOf(passwordd);
        // check if login exists in database
        try {
            Path fileName = Path.of("database.txt");
            String str = Files.readString(fileName);
            if (str.contains(Matwick) & str.contains(pasword)) {
                System.out.println("Login successful");
                // borrow options
                 Scanner skip = new Scanner(System.in);
        System.out.println(" 1. Borrow Books \n" +
                " 2. Return Books ");
        int Cr = Integer.parseInt(skip.nextLine());
        switch (Cr) {
            case 1:
                Books bik = new Books();
                bik.Borrow();
                break;
            case 2:
                Books biks = new Books();
                biks.Return();
                break;
            default:
                System.out.println("Invalid Input");
        }
            } else {
                System.out.println("Wrong details or you dont have an account \n Create an Account Below");
                log_in();
            }
        } catch (IOException f) {
            f.fillInStackTrace();
        }
    } 
}
