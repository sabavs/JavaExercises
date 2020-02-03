interface ABC{
     void show();
}

class Implementor implements ABC{
    public void show(){
        System.out.println("Hello Implementor.");
    }
}
public class Interface {
    public static void main(String[] args){
     ABC obj = new Implementor();
     obj.show();
    }
}
