import java.util.Scanner;

public class thirdReverse{

        public static String reversed(String word){
            String wordReversed = "";

            for(int i = word.length()-1; i>=0;i--){
                wordReversed = wordReversed + word.charAt(i);
            }
            return wordReversed;
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to be reversed: ");
        String word = scanner.nextLine();
        System.out.println("You entered " + word + ".");
        reversed(word);
        System.out.println("Your word reversed is: " + reversed(word) + ".");


    }
}
