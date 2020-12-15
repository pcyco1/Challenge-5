/**
 * Program to find the maximum of two integer numbers
 *  
 * @author Robert https://github.com/pcyco1 
 * @version 11th Now 20 
 */
/**
 Pseudocode (An informal description of a possible solution)
    1.Get all number to a arrary so I can just use the algorithm provied by the library.
    2.Sort the arrary and gat the first one.
    3.Display the rusult to users.
*/

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMin3
{

    public static void main(String[] args)
    {
        int number = 0;
        int rusult = 0;
        int i = 0;
        int looptill = 3;
        int[] numArry = {};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Keyboard lunched");
        System.out.println("We are gonna need 3 intigers: ");

        while (i < looptill){
            System.out.printf("Enter %s nd number: ",(i+1));
            number = keyboard.nextInt();
            //System.out.print(i); //Debug window
            //System.out.println(Arrays.toString(numArry)); Debug window
            numArry = Arrays.copyOf(numArry, numArry.length + 1);
            numArry[numArry.length - 1] = number; // Assign number to the last element
            //System.out.println(Arrays.toString(numArry)); Debug window 
            i = i + 1;
        }
        Arrays.sort(numArry);
        rusult = Array.getInt(numArry,0);
        System.out.printf("The minimum of numbers entered is %s: ",rusult);
        //System.out.println(Arrays.toString(numArry)); Debug window 
        if (1 == 4){
            int count;
            count = 0;
        }

    }
}
