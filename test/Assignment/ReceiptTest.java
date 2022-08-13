package Assignment;



import java.util.*;

public class ReceiptTest {
    public static void main(String[] args) {
        getTime();
        Scanner input = new Scanner(System.in);
        String customerName;
        String itemBought;
        String cashierName;
        String moreItem;
        int quantity;
        double pricePerUnit;
        double discount = 0;
        double discountAmount;
        double total;
        double subTotal = 0;
        double vat;
        double billTotal = 0;
        double amountPaid;
        double balance;


        System.out.println("What is the customer's Name: ");
        customerName = input.nextLine();


        List <Receipt> receipts = new ArrayList<>();

        do {

            try {
                System.out.println("What did he/she buy: ");
                itemBought = input.nextLine();

                System.out.println("Quantity: ");
                quantity = input.nextInt();

                System.out.println("How much per unit: ");
                pricePerUnit = input.nextDouble();

                total = quantity * pricePerUnit;

                receipts.add(new Receipt(itemBought,quantity,pricePerUnit,total));

                subTotal = subTotal + total;

            }
            catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
            System.out.println();
            System.out.println("Add more items (yes/no): ");
            input.nextLine();
            moreItem = input.next();
            input.nextLine();
        }


        while ((Objects.equals(moreItem, "Yes")) || (Objects.equals(moreItem,"yes")));

        if(moreItem.equals("No") || moreItem.equals("no") || moreItem.equals("NO")){
            System.out.println();
        }


        System.out.print("What is your name: ");
        cashierName = input.nextLine();

        try{
            System.out.print("How much discount will he/she get: ");
            discount = input.nextDouble();
        }catch (InputMismatchException e){
            System.out.print("Wrong input");
        }


        discountAmount = subTotal * discount / 100;

        vat = subTotal * 17.5 /100;

        billTotal += subTotal + vat - discountAmount ;

        if(billTotal == 0){
            System.out.print("Buy item(s) to get an invoice");
        }

        else{
            System.out.printf("%nSEMICOLON STORES%n%n MAIN BRANCH%n%n LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS." +
                    "%n%n TEL: 09876890%n%n Cashier: %s%n Customer: %s%n%n", cashierName, customerName);

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
            System.out.println();
            System.out.println();

            System.out.print("\t\t\tITEM \t\t\t QTY \t\t PRICE\t\t TOTAL(NGN)");
            System.out.println();
            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("-");
            }

            System.out.println();

            for (Receipt receipt:receipts) {

                receipt.printFormat();

            }
            System.out.println();
            for (int i = 0; i <= 70; i++){
                System.out.print("-");
            }
            System.out.println();


            System.out.printf("\t\t\t\t\t\t Sub Total: %.2f", subTotal);
            System.out.printf("%n\t\t\t\t\t\t Discount: %.2f", discountAmount);
            System.out.printf("%n\t\t\t\t\t\t VAT @ 17.50: %.2f%n", vat);

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
            System.out.println();
            System.out.println();

            System.out.printf("\t\t\t\t\t\t Bill Total: %.2f", billTotal);

            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
            System.out.println();
            System.out.println();

            System.out.printf("\t THIS IS NOT A RECEIPT, KINDLY PAY %.2f", billTotal);

            System.out.println();
            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }

            System.out.println();
            System.out.println();

            System.out.print("How much did the customer give to you? ");
            input.nextLine();
            amountPaid = input.nextDouble();

            balance = amountPaid - billTotal;

            System.out.print("\t\t\tITEM \t\t\t QTY \t\t PRICE\t\t TOTAL(NGN)");
            System.out.println();
            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("-");
            }

            System.out.println();



            for (Receipt receipt:receipts) {

                receipt.printFormat();

            }
            System.out.println();
            for (int i = 0; i <= 70; i++){
                System.out.print("-");
            }
            System.out.println();


            System.out.printf("\t\t\t\t\t\t Sub Total: %.2f", subTotal);
            System.out.printf("%n\t\t\t\t\t\t Discount: %.2f", discountAmount);
            System.out.printf("%n\t\t\t\t\t\t VAT @ 17.50: %.2f%n", vat);

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
            System.out.println();
            System.out.println();

            System.out.printf("\t\t\t\t\t\t Bill Total: %-1.2f\t", billTotal);

            System.out.printf("%n\t\t\t\t\t\t Amount Paid:  %-1.2f\t", amountPaid);

            System.out.printf("%n\t\t\t\t\t\t Balance:  %-1.2f\t", balance);

            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
            System.out.println();

            System.out.print("\t\t\t\t\t\tTHANKS YOU FOR YOUR PATRONAGE");

            System.out.println();

            for (int i = 0; i <= 70; i++){
                System.out.print("=");
            }
        }

    }

    public static long getCurrentTime(){
        return System.currentTimeMillis();
    }
    public static long getTotalSeconds(){
        long totalSeconds = getCurrentTime() /1000;
        return totalSeconds;
    }
    public static long getCurrentSeconds(){
        long currentSeconds = getTotalSeconds() % 60;
        return currentSeconds;
    }
    public static long getTotalMinutes(){
        long totalMinutes = getTotalSeconds() / 60;
        return totalMinutes;
    }
    public static long getCurrentMinutes(){
        long currentMinutes = getTotalMinutes() % 60;
        return currentMinutes;
    }
    public static long getTotalHour(){
        long totalHour = getTotalMinutes() / 60;
        return totalHour;
    }
    public static long getCurrentHour(){
        long currentHour = getTotalHour() % 24;
        if(currentHour > 23){
            currentHour = 0;
        }
        return currentHour;
    }
    public static void getTime(){
        System.out.printf("%d:%2d:%2d", getCurrentHour() + 1,getCurrentMinutes(), getCurrentSeconds());
    }


}
