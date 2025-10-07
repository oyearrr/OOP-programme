package oop_captcha;

public class VerfiyCodeUtil {
    private  VerfiyCodeUtil(){}//因为工具类没有创建对象的必要，用不着调用构造器，所以将构造器私有化，更符合行业规范

    public static String getcode(int n){
        String code = "";
        for(int i=0;i<n;i++){
            int probability = (int)(Math.random()*3);

            switch(probability){
                case 0:
                    int number = (int)(Math.random()*10);
                    code += number;
                    continue;
                case 1:
                    int number1 = (int)(Math.random()*26);

                    code += (char)('A'+number1);
                    continue;
                case 2:
                    int number2 = (int)(Math.random()*26);
                    char ch1 = (char)('a'+number2);
                    code += ch1;


            }
        }
        return code;
    }
}
