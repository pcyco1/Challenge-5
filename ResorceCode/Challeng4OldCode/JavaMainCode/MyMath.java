/**
 * EE4011 group challenge: challenge 4
 * 
 * @author (QUINYUAN LIU: 20137095),(MANDISI MARSHAL SIBANDA: 20146817)
 * @version 0.1.0
 * @Student
 * @Date_of_Modification 4/12/2020
 * @Description This is My Math classes, which consists of math methods.
 */

public class MyMath {

    public MyMath() {
    }

    /*
     * @Name verage
     * 
     * @Input Paramitere a = 1.0 b = 2.0 c = 4.0 d = 8.0
     * 
     * @Description Test the class MyMath average method reutrins rge aveage of the
     * 4 parameters
     */
    public double average(double a, double b, double c, double d) {
        double sum = (a + b + c + d) / 4;
        System.out.println(String.format(
                "\navargeTest: Test the class MyMath average method \nMyMath.average(%s,%s,%s,%s) Result is %s \nTest passed\n",
                a, b, c, d, sum));
        return sum;
    }

    /*
     * @Name factorial
     * 
     * @Input Paramitere n = 7
     * 
     * @Description This code cuculate fartorial, n!
     * 
     * @sample_rusult 5040
     */
    public static long factorial(int n) {
        long result = 1;
        int conter = 2;
        while (conter <= n) {
            result = result * conter;
            conter++;
        }
        return result;
    }

    /*
     * @Name max
     * 
     * @Input Paramitere a = 7, b = 4, c = 6
     * 
     * @Description This code ruturns the biggest value of the three input.
     * 
     * @sample_rusult 7
     */
    public static int max(int a, int b, int c) {
        int returnMAX = Math.max(Math.max(a, b), c);
        return returnMAX;
    }

    /*
     * @Name sum
     * 
     * @Input Paramitere a = 7, b = 4, c = 6
     * 
     * @Description This code ruturns the biggest value of the three input.
     * 
     * @sample_rusult 7
     */
    public int sum(int n) {
        int i = 0;
        int sum = 0;
        while (i < n + 1) {
            sum += i;
            // Debug window System.out.println(sum);
            i++;
        }
        return sum;
    }

    /*
     * @Name biCoeff
     * 
     * @Input Paramitere n = 5, k = 2
     * 
     * @Description This code ruturns the biggest value of the three input//
     * 
     * @sample_rusult 10
     */
    public static long biCoeff(int n, int k) {
        return (factorial(n) / (factorial(k) * factorial(n - k)));
    }

    /*
     * @Name biCoeff
     * 
     * @Input Paramitere a = 2.0,b = 10
     * 
     * @Description Woking the as Math.pow(a,b), a is the base, b is exponent//
     * 
     * @sample_rusult 1024
     */
    public static double power(double a, int b) {
        return Math.pow(a, b);
    }

    /* ___________________Indivdual code___________________ */

    /*
     * @Name RcCircuitClulaterforEE4001
     * 
     * @Input Paramitere
     * 
     * @Description RcCircuitClulaterforEE4001 that can cluclate most of the munber
     * reuqred in the lab report.
     * 
     * @This code is form Qinyuan Input RTH = 100.000 Capacitance = 0.0001 Tao =
     * 0.01 fcRAD = 100.0 fcHz = 15.915494309189535
     */
    public void RcCircuitClulaterforEE4001(double RTH, double Cacitence) {
        double tao = RTH * Cacitence;
        double fcRAD = 1 / tao;
        double fcHz = fcRAD * (1 / (2 * Math.PI));
        System.out.printf("Tao:%s\nfcRAD: %s\nfcHz: %s", tao, fcRAD, fcHz);
    }

    /*
     * @Name convertCelsisuToFahrenheit
     * 
     * @Input Paramitere celsius = 0
     * 
     * @Description Convert celsisu to fahrenheit 4 parameters
     * 
     * @This code is forn Qinyuan....
     */
    public double convertCelsisuToFahrenheit(double celsius) {
        return (9 / 5) * celsius + 32;
    }


   /* The findRoot1 and findRoot2, takes 3 integers a, b and c and calculates the roots of the equation in the form aX^2-bX + c */
    public static double findRoot1(int a, int b, int c){//calculates one of the roots
        return (-b+Math.sqrt((b*b)-4*a*c))/2*a  ;
    }


    public static double findRoot2(int a ,int b ,int c){// calculates onather roots
       return  (-b-Math.sqrt((b*b)-4*a*c))/2*a;
    }

}