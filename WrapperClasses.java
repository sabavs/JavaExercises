public class WrapperClasses {
    public static void main(String[] args){

        int i = 5; //primitive data type
        Integer ii = new Integer(10); //putting a primitive value inside an object
        int j = ii.intValue();
        System.out.println(j);
    }
}
