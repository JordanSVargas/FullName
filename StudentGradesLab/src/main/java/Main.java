import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        // When
        String output = Arrays.toString(student.getTestScores());
        // Then
        System.out.println(output);


    }
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = { };
    Student student = new Student(firstName, lastName, examScores);
    // When
       // Student.addExamScores(100.0);
    String output = student.getExamScores();
    // Then
        //System.out.println(output);


}
