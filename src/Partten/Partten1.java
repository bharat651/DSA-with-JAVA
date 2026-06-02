package Partten;
import java.util.Scanner;
public class Partten1 {
    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        for(int i=1;i<=userInput;i++){
            int ascii = 64;
            String result="";
            result+=" ".repeat(userInput-i);
            for(int j = 0 ; j<=(2*i-2) ; j++){
                int center = (int)Math.ceil((2*i-1)/2);
                if(j<=center){
                    ascii+=1;
                    char ch= (char) (ascii);
                    result+=ch;
                }
                else{
                    ascii-=1;
                    char ch =(char)(ascii);
                    result+=ch;
                }
            }
            System.out.print(result);
            System.out.println();
        }
        input.close();
    }
}
