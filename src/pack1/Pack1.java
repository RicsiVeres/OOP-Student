package pack1;
import java.util.Scanner;
public class Pack1 {
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    StudentData studentData = new StudentData();
    public void labor1() {
        studentData.AddStudent("Jani", "IT","80", "2500");
        studentData.AddStudent("Feri", "Math", "60", "2000");
        studentData.AddStudent("Dezsoke", "English","48", "2200");

        int command = -1;

        while (command != 0 ){
            menu.ShowPack1Menu();
            command = scan.nextInt();
            switch (command) {
                case 1:
                    studentData.ListAllStudent();
                    break;
                case 2:
                    studentData.AddNewStudent();
                    break;
                case 0:
                    break;
            }
        }
    }
}