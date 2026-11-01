import java.util.Scanner;

public class ProfileCard {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = in.nextInt();

        // The newline left by nextInt() is read by nextLine(), so the name is skipped.
        in.nextLine(); // read the leftover newline

        System.out.print("What is your name? ");
        name = in.nextLine();

        System.out.printf("Hello %s, age %d\n", name, age);

        System.out.printf("Next year you will be %d\n", age + 1);

        in.close();
    }
}