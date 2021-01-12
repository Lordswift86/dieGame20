package PhoneBill;
import java.util.Scanner;

public class PhoneBill {
    double baseCost = 700;
    public static void main(String[] arg) {
        PhoneBill phoneBill = new PhoneBill();
        /*
        Calculate the final total of someone's cell phone bill.
Allow the user to input the plans fee and the number of overage minutes.
Charge the user 30 Naira for every minute they were over their plan,
and 15% tax on the subtotal.
Create separated methods to calculate the tax, overage fee, and final total.
Print the itemized bill..
         */
        PrintReceipt printReceipt = new PrintReceipt();
        BillCalculator billCalculator = new BillCalculator();
        System.out.println("please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        System.out.println("please input your plan fee");
//        double baseFee = scanner.nextInt();
        System.out.println("please input your overage minutes");
        double overage = scanner.nextInt();
        scanner.close();
        double overageCost = billCalculator.calculateOverage(overage);
        double tax = billCalculator.calculateTax(phoneBill.baseCost, overageCost);
        double grossTotal = billCalculator.calculateTotal(phoneBill.baseCost, overageCost, tax);
        printReceipt.displayBill(phoneBill.baseCost, overageCost, tax, grossTotal, name);
    }
}
