import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentData {
    List<Student> studentsList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public List<Student> getStudentsList() {
        return studentsList;
    }
    public void AddNewStudent(){
        String name, score, scholarship, major;
        System.out.print("\033[0mEnter Student Name:");
        name = scan.next();
        System.out.print("Enter Student Score:");
        score = scan.next();
        System.out.print("Enter Student Scholraship:");
        scholarship = scan.next();
        System.out.print("Enter Student Major:");
        major = scan.next();
        this.studentsList.add(new Student(name, major, score,  scholarship));
    }
    public void AddStudent(String name, String major, String score, String scholarship){
        this.studentsList.add(new Student(name, major, score,  scholarship));
    }
    public void ListAllStudent(){
        System.out.println("\u001B[34mName\t\tScore\tMajor\t\tScholarship\u001B[0m");
        System.out.println("\u001B[34m-----------------------------------------------\u001B[0m");
        for (Student student : getStudentsList()) {
            System.out.println("\u001B[33m" + student.Name + "\t\t" + student.Score + "\t\t" +
                    student.Major + "\t\t" + student.Scholarship);
        }
    }
    public void BestStudent(){
        Student bestStudent = null;
        double highestGrade = -1.0;
        for (Student student: getStudentsList()) {
            if (Integer.parseInt(student.Score) > highestGrade) {
                highestGrade = Integer.parseInt(student.Score);
                bestStudent = student;
            }
        }
        if (bestStudent != null){
            System.out.println("\u001B[34mName\t\tScore\tMajor\t\tScholarship\u001B[0m");
            System.out.println("\u001B[34m-----------------------------------------------\u001B[0m");
            System.out.println("\u001B[33m" + bestStudent.Name + "\t\t" + bestStudent.Score + "\t\t" +
                    bestStudent.Major + "\t\t" + bestStudent.Scholarship);
        }
    }
}
