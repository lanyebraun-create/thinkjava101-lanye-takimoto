public class ReceiptTotal {
        public static void main(String[] args) {

        int quantity = 7;
        int unitPriceCents = 20000;

        int totalCents = quantity * unitPriceCents;

        System.out.println("Total cost (cents): " + totalCents);

        int totalDollars = totalCents / 100;

        System.out.println("Total cost (whole dollars): " + totalDollars);
    }
}

