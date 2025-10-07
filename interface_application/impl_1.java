package interface_application;

public class impl_1 implements Data_inter{
    private Student[] students;
    public impl_1(Student[]  students){
        this.students = students;
    }
    @Override
    public void print_student_average_score() {
        double total_score = 0;
        for (int i = 0; i < students.length; i++) {
            total_score += students[i].getScore();
        }
        double average_score = total_score / students.length;
        System.out.println("average score:"+average_score);
    }

    @Override
    public void print_student_info(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"  "+students[i].getGender()+"  "+students[i].getScore());
        }

    }
}
