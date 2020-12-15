import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

/*
 * Challeng#5 ExploreExp
 * @author (Qinyuan Liu 20137095; Mandisi Marshal Sibanda 20146817)
 * @version 0.0.1
 */

public class ExploreExp {
    public static void main(String[] args) {
        partA();
        partB();
        partC();
        partD();
        partE();
    }

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

    //javadoc Requried
    public static double calcExp(double x, int nMax) {
        double reult = 0.0;
        double[] estimateArr = new double[20];
        int i = 0;
        double forPassingToFactorialFonctionBecuseHedoNotTakeInt = i;
        while (i < nMax) {
            forPassingToFactorialFonctionBecuseHedoNotTakeInt = i;
            reult = reult
                    + (factorial(Math.pow(x, i))) / (factorial(forPassingToFactorialFonctionBecuseHedoNotTakeInt));
            estimateArr[i] = reult;
            i++;
        }
        return reult;
    }

    public static double[] genExpEstimates(double x, int nEstimates) {

        double[] newArray = new double[nEstimates];
        int i = 0;

        while (i < nEstimates) {
            newArray[i] = calcExp(x, i);
            System.out.printf("\nThis is form the newArry test:%s\n", newArray[i]);
            i++;
            System.out.println(i);
        }

        return newArray;

    }

    public static void partA(){
        //nothing here~~
    }
    public static void partB(){
        System.out.printf( "Math.Eis %20.18f\n", Math.E);
        System.out.printf( "Math.exp(1.0) is %20.18f\n", Math.exp( 1.0 ));

    }
    public static void partC(){
        double ex = 0.0;
        ex = calcExp(1,20);
        System.out.println(ex);
    }
    public static void partD(){
        //javadoc 
    }
    public static void partE(){
        if (testCalcExp(120.0, calcExp(1, 2), 2.0)){
            System.out.println("Good~~~~");
        }
        else{
            System.out.println("Bad~~~~");
        }
    }

    public static boolean testCalcExp(double expectedValue,double returedValue,double errorRange){
        if (Math.abs(returedValue - expectedValue) < errorRange){
            return true;
        }
        else
            return false;
    }
}