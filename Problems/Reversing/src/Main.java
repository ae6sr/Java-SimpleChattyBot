import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int reverseMe = scanner.nextInt();

        int firstDigit = reverseMe / 100;
        int secondDigit = (reverseMe / 10) % 10;
        int thirdDigit = reverseMe % 10;

        System.out.println(thirdDigit * 100 + secondDigit * 10 + firstDigit);

    }
}