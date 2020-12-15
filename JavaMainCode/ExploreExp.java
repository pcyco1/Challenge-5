/**
 * Challeng#5 ExploreExp
 * 
 * @author (Qinyuan Liu 20137095; Mandisi Marshal Sibanda 20146817)
 * @version 0.0.1
 */

// import java.util.Scanner;
public class ExploreExp {// class open

    private static double ex;

    public static void main(String[] args) {// main open

        double x = 1.0;
        // Scanner input= new Scanner(System.in);

        //ystem.out.printf("Math.E is %20.18f\n", Math.E);                   //Required in b)
        //System.out.printf("Math.exp(1.0)is %20.18f\n", Math.exp(1.0));     //Required in b)
        for (double n = 0; n < 21; n++) {
            ex += (factorial(Math.pow(x, n))) / (factorial(n));
            System.out.printf("%20.18f\n", ex);
        }
        System.out.printf("\nWe got e^x(ex) here: %20.18f\n\n", ex);         // expvalue with a precisionof 18 decimal places: use %20.18fin the format string of a System.out.printfmethod

        // Test the calcExp below , takes in two inputs ,x and nMax to return the
        // exponential value
        System.out.println(".....Testing the calcExp method:....");
        double expectedExp = Math.E;
        double actualExp = calcExp(1, 20);

        if (expectedExp == actualExp) {
            System.out.printf("Test Passed ecpected=%.18f actual=%18f\n", expectedExp, actualExp);
        } else
            System.out.printf("Test failed! %.18f %.18f\n", expectedExp, actualExp);

        // f create another for statement and store the

        double[] expEstimates = new double[21];
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf("This is expcetedEXP: %s", expectedExp);

        for (int i = 0; i < expEstimates.length; i++) {
            expEstimates[i] = calcExp(1, 20);
            System.out.println(expEstimates[i]);

            System.out.println(i);
            // printTable("exp estimates",expEstimates);
        }





        double[] newArray= new double[20];
        int i = 0;
        
        while(i<20){
            newArray[i] = calcExp(1, i);
            System.out.printf("\nThis is form the newArry test:%s\n",newArray[i]);
            i++;
            System.out.println(i);
        }

        printTable("NewArry",newArray);
        
        printTable("exp(2) estimates", genExpEstimates(2.0, 11));
        


    }// main close

    public static void printTable(String title, double[] array) {
        System.out.println(title);
        for (int i = 0; i < array.length; i++)
            System.out.printf("%4d %20.18f\n", i, array[i]);
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

    // d & e creting a method ,ad method testing
    public static double calcExp(double x, int nMax) {
        double reult = 0.0;
        double[] estimateArr=new double[20];
        int i = 0;
        double forPassingToFactorialFonctionBecuseHedoNotTakeInt = i;
        while (i<nMax) {
            forPassingToFactorialFonctionBecuseHedoNotTakeInt = i;
            reult =reult + (factorial(Math.pow(x, i))) / (factorial(forPassingToFactorialFonctionBecuseHedoNotTakeInt));
            estimateArr[i]=reult;
            i++;
        }
        return reult;
    }


    public static double[] genExpEstimates (double x, int nEstimates){


        double[] newArray= new double[20];
        int i = 0;
        
        while(i<nEstimates){
            newArray[i] = calcExp(x, i);
            System.out.printf("\nThis is form the newArry test:%s\n",newArray[i]);
            i++;
            System.out.println(i);
        }

    return newArray;
        
    }

}// close