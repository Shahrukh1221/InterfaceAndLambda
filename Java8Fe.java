interface A{
    void show();
    default void config(){
        System.out.println("In config");
    }
    static void abc(){    // No object needed
        System.out.println("in abc");
    }
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        A.abc();
        A obj=new B();
        obj.show();
        obj.config();
    }
    
}
