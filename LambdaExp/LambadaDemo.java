package Java8Topics.LambdaExp;

import Java8Topics.LambdaExp.InterfaceDemo;

public class LambadaDemo {
    public static void main(String[] args) {
            InterfaceDemo lambaExp = (int a , int b) ->{
                return (a+b);
            };
        System.out.println(lambaExp.toString());
        lambaExp.text(100,200);

    }
}
