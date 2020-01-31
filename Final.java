class A{
    
       final  int DAY;
        public A(){
            DAY = 10;
       }
        
        
    
}

public class FinalDemo{
    public static void main (String [] args){
       A obj = new A(); 
       System.out.println(obj.DAY);
    }
}


/* Use final keyword with variables, methods and classes.

Variables: As soon as you make a variable to final, you can't change its value in the constructor or anywhere else. It has become a CONSTANT. (all caps). Why? Well, you want to create a variable whose value should not change. Like Pi. you dont want to change value of Pi. 

Methods: final int DAY;
public A(){
    DAY = 10;
}

in main {
    System.out.println(obj.DAY);
}

Classes: can't be extended. non-iretable. 

*/
