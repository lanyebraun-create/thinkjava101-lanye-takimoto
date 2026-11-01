import java.util.Scanner;

    public class Chapter3Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %.2f cm\n", inch, cm);
        System.out.printf("Four thirds = %.3f\n", 4.0 / 3.0);
    }
}