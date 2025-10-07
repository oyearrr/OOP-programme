package interface_application;
/*设计学生信息管理模块，封装学生数据：name,gender,score
功能：1.打印全部学生信息  2.打印学生平均成绩   (用两套方案实现)
方案1：打印信息，打印平均成绩(impl_1)
方案2：打印信息（包含男女人数），打印平均成绩（去除最高分和最低分）(impl_2)
 */
public class Test {
    public static void main(String[] args) {
        Student allstudents[] = new Student[8];
        allstudents[0] = new Student("Peter","Male",40);
        allstudents[1] = new Student("Meg","female",50);
        allstudents[2] = new Student("Quagmire","Male",91);
        allstudents[3] = new Student("Stewie","Male",69);
        allstudents[4] = new Student("Lois","female",80);
        allstudents[5] = new Student("Brian","Male",100);
        allstudents[6] = new Student("Chris","Male",90);
        allstudents[7] = new Student("Joe","Male",10);

        Data_inter i1 = new impl_1(allstudents);
        //i1.print_student_average_score();
        //System.out.println();
        //i1.print_student_info();

        Data_inter i2 = new impl_2(allstudents);
        i2.print_student_average_score();
        System.out.println();
        i2.print_student_info();
    }
}
