package intelligent_housing_system;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0] = new JD("TV",true);
        jds[1] = new JD("Air conditioner",false);
        jds[2] = new JD("Washing machine",true);
        jds[3] = new JD("Lamp",false);

        Smart_control smartControl = Smart_control.getInstance();
        //smartControl.control(jds[0]);

        Smart_control.show(jds);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Please make the operation(Input 5 to exit):");
            String j = sc.next();
            switch (j) {
                case "1":
                    smartControl.control(jds[0]);
                    Smart_control.show(jds);
                    break;
                case "2":
                    smartControl.control(jds[1]);
                    Smart_control.show(jds);
                    break;
                case "3":
                    smartControl.control(jds[2]);
                    Smart_control.show(jds);
                    break;
                case "4":
                    smartControl.control(jds[3]);
                    Smart_control.show(jds);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Wrong operation!");
                    break;
            }
        }

    }
}
