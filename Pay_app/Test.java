package Pay_app;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Card c1 = new Golden_Card("Peter", "88888", "123456789", 9100);
        operation(c1);

        Card c2 = new Silver_Card("Meg", "99999", "987654321", 2000);
        operation(c2);
    }

    public static void operation(Card c){
        boolean exit= false;
        while (!exit) {
            System.out.println("Owner:"+c.getOwner_name()+"   Current balance:"+c.getBalance());
            System.out.println("Input your operation:    1.consume  2.recharge  3.exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    pay(c);
                    break;
                case 2:
                    System.out.println("Input the recharge money:");
                    double money = sc.nextDouble();
                    c.deposit(money);
                    System.out.println("Recharge successfully! Current balance:"+c.getBalance());
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    public static void pay(Card c){
        System.out.println("Input the consumption:"+"                         "+ "Current balance:"+c.getBalance());
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}
