// Member Statuc Anonymous Inner class 
class A{
     class B{
        void show(){
            System.out.println("Inner B");
        }
    }
}



public class InnerDemo{
public static void main(String args[]){
    A obj=new A();
    A.B o=new A().new B();
    new A().new B().show();
}
}