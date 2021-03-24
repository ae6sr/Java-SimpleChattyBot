import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        int digitThousands = num1 / 1000;
        int digitHundreds = num1 / 100 % 10;
        int digitTens = num1 / 10 % 10;
        int digitOnes = num1 % 10;

        int result;

        if (digitThousands == digitOnes && digitHundreds == digitTens) {
            result = 1;
        } else {
            result = 35;
        }

        System.out.println(result);
    }
}