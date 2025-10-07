package Pay_app;

public class Card {
    private String owner_name;
    private String car_number;
    private String phone_number;
    private double Balance;

    public Card(){}

    public Card(String owner_name, String car_number, String phone_number, double Balance) {
        this.owner_name = owner_name;
        this.car_number = car_number;
        this.phone_number = phone_number;
        this.Balance = Balance;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void deposit(double money){
        this.Balance += money;
    }

    public void consume(double money){
        this.Balance -= money;
        System.out.println("The balance is:");
    }
}
