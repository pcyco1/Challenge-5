/**
 * EE4011 group challenge: challenge 4
 * 
 * @author (QUINYUAN LIU: 20137095),(MANDISI MARSHAL SIBANDA: 20146817)
 * @version 0.1.0
 * @Student
 * @Date_of_Modification 4/12/2020
 * @Description This is the Test code, for testing purpose, the code tests all
 *              the methods in MyMath.
 */

public class MyMathTest {

    public static void main(String[] args) {
        // MyMath ObjTest0 = new MyMath();
        // System.out.println(ObjTest0.average(1, 2, 3, 4));
        // System.out.println(ObjTest0.sum(4));
        // ObjTest0.RcCircuitClulaterforEE4001(100.000, 0.0001);
        // System.out.printf("\n\n%S\n",ObjTest0.convertCelsisuToFahrenheit(12));
        // Tests factoriall method in MyMath
        long expectedfactorial = 5040; // creates an instance variable
        long actualfactorial = MyMath.factorial(7); // calls factorial method in MyMath
        System.out.print("   factorial() Test \n");
        System.out.println("Test the factorial method in MyMath:");
        System.out.printf("MyMath.factorial(7) Results is %d \n", actualfactorial);
        if (actualfactorial == expectedfactorial)
            System.out.println("factorial Test passed\n");
        else
            System.out.println("factorial Test failed");

        long expectedMax = 7; // creates an instance variable
        long actualMax = MyMath.max(7, 4, 6); // calls factorial method in MyMath
        System.out.print("   max() Test \n");
        System.out.println("Test the max method in MyMath:");
        System.out.printf("MyMath.max(7,4,6) Results is %d \n", actualMax);
        if (actualMax == expectedMax)
            System.out.println("Max Test passed\n");
        else
            System.out.println("Max Test failed");

        // Tests biCoeff method in MyMath.
        long expectedbiCoeff = 10; // also creates an instance variable
        long actualbiCoeff = MyMath.biCoeff(5, 2); // calls biCoeff method in MyMath
        System.out.print("    biCoeff() Test\n ");
        System.out.println("Test the biCoeff method in MyMath:");
        System.out.printf("MyMath.biCoeff(5,2) Results is %d \n", actualbiCoeff);
        if (actualbiCoeff == expectedbiCoeff)
            System.out.println("biCoeff Test passed\n");
        else
            System.out.println("biCoeff Test failed");

        // Tests MyMath.power in MyMath.
        long expectedPower = 1024; // also creates an instance variable
        double actualPower = MyMath.power(2.0, 10); // calls method power in MyMath
        System.out.print("    Power Test\n");
        System.out.println("Test the power method in MyMath:");
        System.out.printf("MyMath.power((2.0,10) Results is %.2f \n", actualPower);
        if (actualPower == expectedPower)
            System.out.println("power Test passed");
        else
            System.out.println("power Test failed");

        if (actualfactorial == expectedfactorial && actualMax == expectedMax && actualbiCoeff == expectedbiCoeff
                && actualPower == expectedPower)
            System.out.println("\n MyMath test successful \n\n");
        else
            System.out.println("MyMath Test was not completely successful!");

        /*
         * ___________________*_*_*_*_*_*Test_*_*_*_*_*_*_*_*_*_*_Indivdual_Test_code
         * Test*_*_*_*_*_*_*_*_*_*_*_*_*Test_*_*_*____________________
         */

        // Tests in MyMath.
        System.out.print("RcCircuitClulaterforEE4001(100.000, 0.0001)\n");
        MyMath ObjTestQinyiuan = new MyMath();
        ObjTestQinyiuan.RcCircuitClulaterforEE4001(500.00,0.000001 );
        System.out.printf("RcCircuitClulaterforEE4001(100.000, 0.0001) Successfully called\n\n");

        double input_celsius = 0.0;
        double expeted_Fahrenheit = 32.00;
        System.out.print("    convertCelsisuToFahrenheit()\n");
        System.out.println("Test the convertCelsisuToFahrenheit() method in MyMath:");
        System.out.printf("convertCelsisuToFahrenheit(0.0) Results is %.2f \n",
                ObjTestQinyiuan.convertCelsisuToFahrenheit(input_celsius));
        if (ObjTestQinyiuan.convertCelsisuToFahrenheit(input_celsius) == expeted_Fahrenheit)
            System.out.print("power Test passed");
        else
            System.out.println("convertCelsisuToFahrenheit() Test failed");

        if (actualfactorial == expectedfactorial && actualMax == expectedMax && actualbiCoeff == expectedbiCoeff
                && actualPower == expectedPower)
            System.out.println("\n convertCelsisuToFahrenheit() test successful");
        else
            System.out.printf("convertCelsisuToFahrenheit() Test was not completely successful!\n\n");


            
        long expectedRoot1 = 3;
        long expectedRoot2 = 2;

        String QuadEqtn = "1X^2-5X+6"; // creates a string
        System.out.printf("Finding roots of the equation %s", QuadEqtn);
        // the general formulae for a quadratic equation is aX^2 - bX + c
        // the MyMath.findroot takes int integers like this findRooT1(a,b,c) to find one
        // of the roots of the eqation in String QuadEqtn
        double actualRoot1 = MyMath.findRoot1(1, -5, 6); // calls method power in MyMath
        double actualRoot2 = MyMath.findRoot2(1, -5, 6);
        System.out.print("  \n  Findingroots  Test\n");
        System.out.println("Test the power method in MyMath:");
        System.out.printf("The roots of %s are %.2f and %.2f \n", QuadEqtn, actualRoot1, actualRoot2);
        if (actualRoot1 == expectedRoot1 && actualRoot2 == expectedRoot2)
            System.out.println("power Roots Test passed");
        else
            System.out.println("power Roots Test failed");
    }

}