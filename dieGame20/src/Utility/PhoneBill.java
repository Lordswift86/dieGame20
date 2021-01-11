package Utility;

import java.text.NumberFormat;
import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] arg) {
        /*
        Calculate the final total of someone's cell phone bill.
Allow the user to input the plans fee and the number of overage minutes.
Charge the user 30 Naira for every minute they were over their plan,
and 15% tax on the subtotal.
Create separated methods to calculate the tax, overage fee, and final total.
Print the itemized bill.
         */

        System.out.println("please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("please input your plan fee");
        double planFee = scanner.nextInt();
        System.out.println("please input your overage minutes");
        double overage = scanner.nextInt();
        scanner.close();
        double overageCost = calculateOverage(overage);
        double tax = calculateTax(planFee, overageCost);
        double grossTotal = calculateTotal(planFee, overageCost, tax);
        displayBill(planFee, overageCost, tax, grossTotal, name);
    }

    //calculate the cost of overage
    public static double calculateOverage(double overage) {
        int overageCharge = 7;
        double overageCost = overage * overageCharge;
        return overageCost;
    }

    //hi
    // Calculate the tax on subtotal
    public static double calculateTax(double planFee, double overageCost) {
        double tax = (planFee + overageCost) * 0.15;
        return tax;
    }

    public static double calculateTotal(double planFee, double overageCost, double tax) {
        double grossTotal = planFee + overageCost + tax;
        return grossTotal;
    }

    public static void displayBill(double planFee, double overageCost, double tax, double grossTotal, String name) {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println("............" + name + "'s " + "Phone Bill Statement...........");
        System.out.println("Plan Fee : " + defaultFormat.format(planFee));
        System.out.println("Overage  : " + defaultFormat.format(overageCost));
        System.out.println("Tax      : " + defaultFormat.format(tax));
        System.out.println("Total    : " + defaultFormat.format(grossTotal));
    }
}
