public class question_11 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        System.out.println(age >= 18 && hasID); // true

        int denominator = 0;
        boolean safe = denominator != 0 && 10 / denominator > 1;
        System.out.println(safe); // false, no division occurs
        
       
        boolean answer = 5 > 2 && 10 < 4;
        System.out.println(answer);
    }
}
