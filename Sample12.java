// Inner class member ,static and anonymous
class A{
    public void show(){
        System.out.println("In show");
    }
     class B{
        public void display(){
            System.out.println("In display");
        }

    }
}
interface C{
    public void show();
    default void display(){
            System.out.println("In C display");
        }
    static void play(){
        System.out.println("In C play");
    }
}
class Sample12{
    public static void main(String args[]){
            A obj=new A();
            obj.show();
            A.B b=obj.new B();
            b.display();
            new A().show(); // Anonymous object
            new A().new B().display();

            //Lambda
            C c=()->{
                System.out.println("HEllo world");
            };
            c.show();
            c.display();
            C.play();
            
            
    }
}

//This is showing error
//Code is correct but some problem in extension
//Same code is running in Online Java compiler
// Sir if I run this with javac and java it'll work but not through button
//Some extension issue
// Lab ok this im using