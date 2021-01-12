package PhoneBill;


import java.util.Random;

public class BillCalculator {
    /*
    So, a phone bill should have an ID, a base cost, a number of allotted minutes and a number of minutes used. And
    then, it should also be able to calculate the overage, calculate the tax, and calculate the total.
    And then, it should also be able to print an itemized bill.
     */
    // generate I.D
    public int idGenerator() {
        Random random = new Random();
        int id;
        return id = random.nextInt(10000);
    }

    //known fields
    //colect user data
    //calculate the cost of overage
    public double calculateOverage(double overage) {
        int overageCharge = 7;
        double overageCost = overage * overageCharge;
        return overageCost;
    }

    //hi
    // Calculate the tax on subtotal
    public double calculateTax(double planFee, double overageCost) {
        double tax = (planFee + overageCost) * 0.15;
        return tax;
    }

    public double calculateTotal(double planFee, double overageCost, double tax) {
        double grossTotal = planFee + overageCost + tax;
        return grossTotal;
    }
}
