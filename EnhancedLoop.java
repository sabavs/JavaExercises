public class EnhancedLoop{
    public static void main(String[] args){
        int e[][] = {
                {1,2,3,4},
                {5,6},
                {7,8,9,10,11}
        };

        for(int k[] : e){
            for(int l : k){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
