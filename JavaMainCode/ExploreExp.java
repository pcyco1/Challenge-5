/**
 * Challeng#5 ExploreExp
 *  
 * @author (Qinyuan Liu 20137095)
 * @version 0.0.1
 */


public class ExploreExp
{

    public static void main(String[] args){
        Double ex =0.0;
        double x = 1.0;
        System.out.printf("Math.E is %20.18f\n",Math.E);
        System.out.printf("Math.exp(1.0)is %20.18f\n", Math.exp(1.0));
        for (double n = 0; n < 21; n++){
            ex += Math.pow(x, n)/(factorial(n));
            System.out.println(ex);
        }
        System.out.println(10.0);
    }


    public static double factorial(Double n) {
        double result = 1.0;
        int conter = 2;
        while (conter <= n) {
            result = result * conter;
            conter++;
        }
        return result;
    }
}
