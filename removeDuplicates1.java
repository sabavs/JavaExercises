import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class removeDuplicates{
    public static String reversed(String word){
        String noReps = "";
        HashSet<Character> set = new HashSet<>();
        for(char c : word.toCharArray()){
            if(set.add(c)){
                noReps = noReps + c;
            }
        }
        return noReps;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();
        System.out.println("Your word is: " + word + ".");

        System.out.println(reversed(word));


    }
}
