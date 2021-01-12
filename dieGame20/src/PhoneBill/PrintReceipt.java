package PhoneBill;

import java.text.NumberFormat;

public class PrintReceipt {
    BillCalculator billCalculator = new BillCalculator();

    public void displayBill(double planFee, double overageCost, double tax, double grossTotal, String name) {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println("............" + name + "'s " + "Phone Bill Statement...........");
        System.out.println("Bill Number : " + billCalculator.idGenerator());
        System.out.println("Plan Fee : " + defaultFormat.format(planFee));
        System.out.println("Overage  : " + defaultFormat.format(overageCost));
        System.out.println("Tax      : " + defaultFormat.format(tax));
        System.out.println("Total    : " + defaultFormat.format(grossTotal));
    }

}
