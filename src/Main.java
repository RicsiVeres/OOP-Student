import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    StudentData studentData = new StudentData();

    studentData.AddStudent("Jani", "IT","80", "2500");
    studentData.AddStudent("Feri", "Math", "60", "2000");
    studentData.AddStudent("Dezsoke", "English","48", "2200");

    int command = -1;

    while (command != 0){
        menu.ShowMenuOptions();
        command = scan.nextInt();

        switch (command) {
            case 0:
                break;
            case 1:
                studentData.ListAllStudent();
                break;
            case 2:
                studentData.AddNewStudent();
                break;
            case 3:
                studentData.BestStudent();
                break;
            default:
                menu.ShowMenuOptions();
                command = scan.nextInt();
            }
        }
    }
}