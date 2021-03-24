import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        String result = "False";

        if (num1 > -15 && num1 <= 12 || num1 > 14 && num1 < 17 || num1 >= 19) {
            result = "True";
        }

        System.out.println(result);
    }
}