
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
        partF();
        partG();
        partH();
        partI();
        //partJ();
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

    //Javadoc Requried
    public static double calcExp(double x, int nMax) {
        double reult = 0.0;
        //double[] estimateArr = new double[20];
        int i = 0;
        double iDouble= i;
        while (i < nMax) {
            iDouble = i;
            reult = reult
                    + (factorial(Math.pow(x, i))) / (factorial(iDouble));
            //estimateArr[i] = reult;
            i++;
        }
        //printTable("NoTital", estimateArr);
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

    public static boolean testCalcExp(double expectedValue,double returedValue,double errorRange){
        if (Math.abs(returedValue - expectedValue) < errorRange){
            return true;
        }
        else
            return false;
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
        if (testCalcExp(2,calcExp(1, 2), 0.01)){
            System.out.println("Test for calcExp() passed");
        }
        else{
            System.out.println("Test for calcExp() passed");
        }
    }
    public static void partF(){
        double[] expEstimates = new double[21];
        int i = 0;
        while (i < 21) {
            expEstimates[i] = calcExp(1, i);
            //System.out.printf("\nThis is form the newArry test:%s\n", expEstimates[i]);
            i++;
            //System.out.println(i);
        }
        printTable("expEstimates", expEstimates);
    }
    public static void partG(){
        //print table
    }
    public static void partH(){
        //genExpEstimates(x, nEstimates)
    }
    public static void partI(){
        printTable("exp(2) estimates", genExpEstimates(2.0, 11));
    }
    /*public static void partJ(){
        int i = 1;
        while (i < 5){
            System.out.println(Math.exp(i * 20));
            System.out.println(calcExp(i, 10));
            //double errorDiffence = Math.abs(Math.exp(i * 20) - calcExp(i * 20, 10));
            //System.out.println(errorDiffence);
            i++;
            System.out.println(i);
        }
    
    }*/

}

