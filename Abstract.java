class Printer{
    public void show(Number i){
        System.out.println(i);
    }
    
 
}

public class HelloWorld{

     public static void main(String []args){
         Printer obj = new Printer();
         obj.show(8.5f);
         
         
        
     }
}
/*Why do we need abstract classes?
Number is a super class. Number is an abstract class. We use number as a value in a parameter in a method. Its an abstract class.We never created an object of Number. What they did is to make Number an abstract class. Integer and double will extend number. And we can create object of Integer or Number. 5.5 is not an number it is a double but because double extends Number, it will work. 

Create your own pen and again Pencil. Then create a superclass  Writer. Both Pen and Pencil classes can extend Writer class. You can make writer an abstract class. even float extends number. 


*/
