package intelligent_housing_system;



public class JD implements Switch{
    private static final JD jds = new JD();//Eager single instance
    public static JD getInstance(){
        return jds;
    }

    @Override
    public void press(){
        status = !status;
        //System.out.println("Current status:"+ (status ? "ON":"OFF"));
    }

    private String name;
    private boolean status;

    public JD(){}

    public JD(String name,boolean status){
        this.status = status;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
