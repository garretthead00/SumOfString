/** Garrett Head
 * 
 * This program will compute the sum of the numbers in a given string by using
 * both iteration and recursion
 * 
 */

package sumlistthing;
import java.util.Scanner;
 
public class SumListThing {
    public static int itSum=0;
    public static int recSum=0;

    public static void main(String[] args) {
        
        System.out.printf("\nGarrett Head\nSumListThing\n5/18/2015\n\n");
        System.out.printf("Input a string of numbers.\n");
        Scanner in = new Scanner(System.in);
        
        String sumList = new String();       
        sumList = in.next();
        
        System.out.printf("\nInput list of numbers: " + sumList + "\n\n");
        System.out.printf("Sum of numbers in List using: \n");
        
        itSum = iterativeSum(sumList);
        System.out.printf("a) iteration: "+ itSum + "\n");
        
        recSum = recursiveSum(sumList);
        System.out.printf("b) recursion: " + recSum + "\n");       
    }
    
    public static int recursiveSum(String list){        
        if ((null == list) || (list.length() <= 1)) {      
            return Integer.parseInt(list);
        }     
        return recursiveSum(list.substring(1)) + (list.charAt(0)-'0');
    }
       
    public static int iterativeSum(String list){       
        for (int x = 0; x<list.length(); x++){
            itSum += (list.charAt(x)-'0');
        }     
        return itSum;  
    }   
}
