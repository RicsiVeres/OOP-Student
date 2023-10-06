import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    CommandHandler commandHandler = new CommandHandler();
    StudentData studentData = new StudentData();


    studentData.AddNewStudent("Jani", "info","80", "2500");
    studentData.AddNewStudent("Feri", "matek", "60", "2500");
    studentData.AddNewStudent("Dezsoke", "info","48", "0");

    menu.ShowMenuOptions();

    int command = 10;


    while (command != 0){

        menu.ShowMenuOptions();
        command = scan.nextInt();

        switch (command) {
            case 1:
                commandHandler.ShowData();


                System.out.println("\u001B[34mName\t\tScore\tMajor\t\tScholarship\u001B[0m");
                System.out.println("\u001B[34m-----------------------------------------------\u001B[0m");

                for (Student student : studentData.getStudentsList()) {
                    System.out.println("\u001B[33m" + student.Name + "\t\t" + student.Score + "\t\t" +
                            student.Major + "\t\t" + student.Scholarship);
                }
                break;
            case 2:
                String name, score, scholarship, major;
                System.out.print("\033[0mEnter Student Name:");
                name = scan.next();
                System.out.print("Enter Student Score:");
                score = scan.next();
                System.out.print("Enter Student Scholraship:");
                scholarship = scan.next();
                System.out.print("Enter Student Major:");
                major = scan.next();
                studentData.AddNewStudent(name, major, score, scholarship);
                break;
            case 3:
                commandHandler.ShowStudentList();
                break;
            default:
                menu.ShowMenuOptions();
                command = scan.nextInt();
            }
        }
    }


}