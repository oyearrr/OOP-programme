package Pay_app;

public class Silver_Card extends  Card{

    public Silver_Card(){}

    public Silver_Card(String owner_name, String car_number, String phone_number, double Balance) {
        super(owner_name, car_number, phone_number, Balance);
    }
    @Override
    public void consume(double money) {
        System.out.println("Current consumption:"+ money);
        if(getBalance() < money*0.9){
            System.out.println("Insufficient balance,please recharge!");
            return;
        }
        setBalance(getBalance()-money*0.9);
        System.out.println("The balance is:"+getBalance());
    }
}
