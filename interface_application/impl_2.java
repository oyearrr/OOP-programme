package interface_application;

public class impl_2 implements Data_inter{
    private Student[] students;
    public impl_2(Student[] students){
        this.students = students;
    }
    @Override
    public void print_student_average_score() {
       //去除最高分和最低分
        double total_score = 0;
        for (int i = 0; i < students.length; i++) {
            total_score += students[i].getScore();
        }
        double max = 0;
        double min = 0;
        for (int i = 1; i < students.length; i++) {
            if(students[i-1].getScore()>students[i].getScore()){
                max = students[i].getScore();
            }
        }
        for (int i = 1; i < students.length; i++) {
            if(students[i-1].getScore()<students[i].getScore()){
                min = students[i].getScore();
            }
        }
        double average_score = (total_score-(min+max))/(students.length-2);
        System.out.println("average score:"+average_score);
    }

    @Override
    public void print_student_info() {
        int male_num = 0;
        int female_num = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getGender().equals("Male")){
                male_num++;
            }
        }
        female_num = 8-male_num;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"  "+students[i].getGender()+"  "+students[i].getScore());
        }
        System.out.println("Male:"+male_num+"  Female:"+female_num);


    }
}
