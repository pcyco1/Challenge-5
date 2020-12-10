/**
 * EE4011 Challeng3
 * 
 * @author Qinyuan Liu
 * @version 0.0.5
 * @Student_ID 20137095
 * @Date_of_Modification 11/30/2020
 * @Description This is the part class, call this class for a new part
 */

public class Part {
    public String id = "";
    public String descr = "";
    public int quantity = 0;
    public double price = 0.0;
    public double discount = 0.0;
    public double result1 = 0;

    public Part() {
        this.id = "";
        this.descr = "";
        this.quantity = 0;
        this.price = 0.0;
        this.discount = 0.0;
    }

    // ******************______C______******************* */

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 10000.00;
        } else {
            this.price = price;
        }
    }

    public void setDiscount(double discount) {
        if ((0.0 <= discount) & (discount <= 80)) {
            this.discount = discount;
        } else {
            this.discount = 0;
        }

    }

    public void setId(String id) {
        this.id = id;
    };

    public void setDescription(String descr) {
        this.descr = descr;
    }

    public String getDescription(String descr) {
        return this.descr;
    };

    public String getId(String id) {
        return this.id;
    };

    public int getQuantity(int quantity) {
        return this.quantity;
    }

    public double getPrice(double price) {
        return this.price;
    }

    public double getDiscount(String descr) {
        return this.discount;
    }

    // ******************______D______******************* */

    public String toString() {
        String ReturnStr = "ID: %s \nDescription: %s \nQuantity: %s \nPrice: %s \nDiscount: %s'\n";
        return String.format(ReturnStr, this.id, this.descr, this.quantity, this.price, this.discount);

    }

    // ******************______E______******************* */
    public double computeTotal() {
        result1 = this.quantity * this.price * this.discount / 100;
        return result1;
    }

}