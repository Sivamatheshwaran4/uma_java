package Practices;

public abstract class Abstract_Ex {
    abstract void run();
}
class child extends Abstract_Ex{
    @Override
    void run(){
        System.out.println("Abstract method running");
    }

    public static void main(String[] args) {
       child c=new child();
       c.run();
    }
}
