import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("Rohit");
        System.out.println(studentsName.get(0));
        studentsName.add(2, "Pranav");
        
    }
    
}
