public class ReceiptTotalFixed {
    public static void main(String[] args) {

        int quantity = 7;
        int unitPriceCents = 20000;

        int totalCents = quantity * unitPriceCents;

        double totalDollars = totalCents / 100.0;

        System.out.println("Total cost (dollars): " + totalDollars);

        double y1 = 1 / 3;
        System.out.println("y1: " + y1);

        double y2 = 1.0 / 3.0;
        System.out.println("y2: " + y2);

    }
}