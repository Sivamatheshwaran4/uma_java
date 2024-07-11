package Practices;
public class MethodOverriting {
    void run() {
        System.out.println("This is parent");
    }
}
    class child2 extends MethodOverriting{
        @Override
        void run(){
            System.out.println("This is child");
        }



        public static void main(String[] args) {
            child2 c=new child2();
            c.run();
            MethodOverriting p=new MethodOverriting();
            p.run();
        }


}

