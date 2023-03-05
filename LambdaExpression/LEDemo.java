@FunctionalInterface
interface Car{
    void show();
}

class LEDemo{
    public static void main(String args[]){
        //For shorting the code no Inner class object is made good for memory
        Car c=() -> System.out.println("Deiving");
        c.show();
        Car c1=() -> System.out.println("Deiving");
        c1.show();
        
    }
}