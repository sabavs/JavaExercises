class Calc{
    public int add(int i, int j){
        return  i + j;
    }
}
class Calc2 extends Calc{
    public int sub(int i, int j){
        return i-j;
    }
}
class Calc3 extends Calc2{
    public int mult(int i, int j){
        return i*j;
    }
}

public class Inheritance {
    public static void main(String[] args){

    Calc3 c1 = new Calc3();
    int result1 = c1.mult(9,8);
    int result2 = c1.sub(10,5);
    int result3 = c1.add(3, 9);
    System.out.println(result1);
    }

}
