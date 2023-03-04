interface Computer{
     void compileCode();
}

class Laptop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("Faster You got 5 errors");
    }
}


class Developer{
    public void buildApp(Computer obj) {
        System.out.println("Building app...");
        
        obj.compileCode();

    }

}


class Main{
    
    public static void main(String args[]){
        Developer dev=new Developer();
    
        Desktop des=new Desktop();
        Laptop obj=new Laptop();
        dev.buildApp(des);
        dev.buildApp(obj);

    }
}