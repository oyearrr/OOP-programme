package Pay_app;
import java.util.Scanner;
public class Golden_Card extends  Card{

    public Golden_Card(){}

    public Golden_Card(String owner_name, String car_number, String phone_number, double Balance){
        super(owner_name, car_number, phone_number, Balance);
    }
    @Override
    public void consume(double money) {
        System.out.println("Current consumption:"+ money);
        if(getBalance() < money*0.8){
            System.out.println("Insufficient balance,please recharge!");
            return;
        }
        setBalance(getBalance()-money*0.8);
        System.out.println("The balance is:"+ getBalance());
        if(money * 0.8 >= 200){
            print_tricket();
        }
    }

    public void print_tricket(){
        System.out.println("you get one free car wash");
    }
}
