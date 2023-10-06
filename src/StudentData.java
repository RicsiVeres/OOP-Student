import java.util.ArrayList;
import java.util.List;

public class StudentData {
    List<Student> studentsList = new ArrayList<>();
    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void AddNewStudent(String name,String major, String score,String scholarship){

        this.studentsList.add(new Student( name,major, score,  scholarship));
    }
}
