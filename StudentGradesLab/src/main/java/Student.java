import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private Double[] testScores;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getTestScores() {
        return testScores;
    }
    public int getNumberOfExamsTaken(int numberOfExamsTaken){
        return numberOfExamsTaken;
    }

    public Double[] examsScores(String tesScores){
        return testScores;
    }

    public String getExamScores() {
        String exam = "Exam scores \n";
        for (int i = 0; i < examScores.size(); i++) {
            exam += "Exam " + (i + 1) + "-> " + examScores.get(i) + "\n";
        }
        return exam;
    }


    public Double getAverageExamScore() {
        return null;
    }

    public String getFullName(Student student) {
        if(Objects.equals(student.getFirstName(), this.firstName));
        return firstName+lastName;
    }
}
