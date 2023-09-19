import java.security.PrivateKey;
import java.util.*;

public class Classroom {

    private Student[] students;

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(){
        this.students = new Student[7];
    }
    public Student[] getStudents() {
        return this.students;
    }



    public Double getAverageExamScore() {
        Double totalAverageScore = 0.0;
        for (Student student: students){
            totalAverageScore += student.getAverageExamScore();
        }
        return totalAverageScore/students.length;
    }




    public void addStudent(Student student) {
        ArrayList<Student> students1 = new ArrayList<>(Arrays.asList(students));
        students1.add(student);
        this.students = students1.toArray(new Student[0]);
    }

    public void removeStudent(String firstname, String lastName){
        ArrayList<Student> studs = new ArrayList<>(Arrays.asList(students));
        for (Student student : studs) {
            if ( student != null && student.getFirstName() != null && student.getLastName() != null &&
                    student.getFirstName().equals(firstname) && student.getLastName().equals(lastName)) {
                studs.remove(student);
                break;
            }
        }
        this.students = studs.toArray(new Student[0]);
    }

    public Student[] getStudentsByScore(){

        List<Student> studentListe = new ArrayList<>(Arrays.asList(students));

        Collections.sort(studentListe, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

                double score1 =o1.getAverageExamScore();
                double score2 = o2.getAverageExamScore();

                if(score1 > score2){
                    return -1;
                } else if (score1 < score2){
                    return 1;


                } else {
                    return  o1.getFullName(o1).compareTo(o2.getFullName(o2));

                }
            }
        });

        return studentListe.toArray(new Student[0]);
    }

    public HashMap<String, String> getGradeBook(){

        HashMap<String, String> gradeBook = new HashMap<>();

        ArrayList<Student> studentsAsList = new ArrayList<>(Arrays.asList(students));
        //calculate the maximum average exam score among all students
        Double maxNumber =

                studentsAsList.stream()

                        .max(Comparator.comparing(Student::getAverageExamScore))



                        .get()
                        .getAverageExamScore();


        Double gradingCurve = maxNumber - 100 ;
        for (Student student: students) {
            double studentScore = student.getAverageExamScore();
            String grade;

            if (studentScore >= (maxNumber - 0.10 * gradingCurve)) {
                grade = "A";
            } else if (studentScore >= (maxNumber - 0.29 * gradingCurve)) {
                grade = "B";
            } else if (studentScore >= (maxNumber - 0.50 * gradingCurve)) {
                grade = "C";
            } else if (studentScore >= (maxNumber - 0.89 * gradingCurve)) {
                grade = "D";
            } else {
                grade = "F";
            }

            String fullName = student.getFullName(student);
            gradeBook.put(fullName, grade);
        }
        return gradeBook;
    }

}
