package intelligent_housing_system;
//单例类
public class Smart_control {
    private static final Smart_control smartControl = new Smart_control();//Eager single instance
    private Smart_control(){}
    public static Smart_control getInstance(){
        return smartControl;
    }

    public void control(JD jd){
        System.out.println(jd.getName()+ "Current status:"+(jd.isStatus() ? "ON":"OFF"));
        jd.press();
        System.out.println("Operating...");
        System.out.println(jd.getName()+ "Current status:"+(jd.isStatus() ? "ON":"OFF"));
    }

    public static void show(JD[] jds){
        for (int i = 0; i < jds.length; i++) {
            System.out.println((i+1)+"."+jds[i].getName()+ "Current status:"+(jds[i].isStatus() ? "ON":"OFF"));
        }
    }

    }
