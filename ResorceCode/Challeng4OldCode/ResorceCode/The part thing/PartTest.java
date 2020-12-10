/**
 * EE4011 Challeng3
 * 
 * @author Qinyuan Liu
 * @version 0.0.5
 * @Student_ID 20137095 
 * @Date_of_Modification 11/30/2020
 * @Description This is the Test code, for testing purpose
 */

public class PartTest {

    public static void main(String[] args) {
        Part ObjTest0 = new Part();
        ObjTest0.setQuantity(120);
        ObjTest0.setPrice(10.00);
        ObjTest0.setDiscount(79.9);
        ObjTest0.setId("0001");
        ObjTest0.setDescription("This is the Objtest0");
        System.out.println(ObjTest0.toString());

        Part ObjTest1 = new Part();
        ObjTest1.setQuantity(20);
        ObjTest1.setPrice(1.00);
        ObjTest1.setDiscount(69.9);
        ObjTest1.setId("0002");
        ObjTest1.setDescription("This is the Objtest1");
        System.out.println(ObjTest1.toString());
    }

}