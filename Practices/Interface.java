package Practices;
public interface Interface {
    void run();
}
class child1 implements Interface{

    @Override
    public void run() {
        System.out.println("Interface method running");
    }

    public static void main(String[] args) {
        child1 c=new child1();
        c.run();
        
        
    }
}
