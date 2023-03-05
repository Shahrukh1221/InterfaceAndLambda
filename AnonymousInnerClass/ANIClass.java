interface Car{
    void drive();
}
// class WagonR implements Car{
//     public void drive(){
//         System.out.println("Driving");
//     }
// }

class ANIClass{
    public static void main(String args[]){

        //Anonymous Inner class will be created and named as 1
        Car obj=new Car(){
            public void drive(){
            System.out.println("Driving");
            }
        };
        obj.drive();
        // Anonymous inner class also creates multiple Instances / multiple objects 
        


        //1 Instance of a class is created when using class implementing interface
        // Car r1=new WagonR();
        // r1.drive();
        // Car r2=new WagonR();
        // r2.drive();

     
    } 
}