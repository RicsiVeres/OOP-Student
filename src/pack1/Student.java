package pack1;
public class Student {
    private String Name, Major, Scholarship, Score;
     Student(String name, String major,String score, String scholarship){
        this.Name = name;
        this.Major= major;
        this.Score= score;
        this.Scholarship = scholarship;
    }
    public String Name(){
         return Name;
    }
    public String Major(){
         return Major;
    }
    public String Score(){
         return Score;
    }
    public String Scholarchip(){
         return Scholarship;
    }
}




