import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int pbCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean validateWeekday = !weekend && pbCups >= 10 && pbCups <= 20;
        boolean validateWeekend = weekend && pbCups >= 15 && pbCups <= 25;

        boolean result = validateWeekday ^ validateWeekend;

        System.out.println(result);
    }
}