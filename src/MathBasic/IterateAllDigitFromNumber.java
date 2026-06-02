package MathBasic;
import java.util.Scanner;
import java.util.ArrayList;
public class IterateAllDigitFromNumber {
    public static void main(String[]a){
        ArrayList al = new ArrayList();
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        while(userInput != 0){
            int lastDigit = userInput%10;
            al.add(lastDigit);
            userInput = userInput/10;

        }
        for(int i =al.toArray().length-1;i>=0;i--){
            System.out.println(al.get(i));
        }
        input.close();
    }
}
