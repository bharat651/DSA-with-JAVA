package Partten;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int row = (2*userInput-1);
        int column = (2*userInput-1);
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column;j++){
                int left = j;
                int top = i;
                int right =column-j-1;
                int bottom = row-i-1;
                int minimum = Collections.min(Arrays.asList(left,right,top,bottom));
                System.out.print(userInput-minimum+" ");
            }
            System.out.println();
        }
    }
}

//3 3 3 3 3
//3 2 2 2 3
//3 2 1 2 3
//3 2 2 2 3
//3 3 3 3 3