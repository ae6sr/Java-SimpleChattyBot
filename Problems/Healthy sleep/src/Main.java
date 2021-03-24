import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int minA = scanner.nextInt();
        scanner.nextLine();
        int maxB = scanner.nextInt();
        scanner.nextLine();
        int actualH = scanner.nextInt();

        String result = null;

        if (actualH >= minA && actualH <= maxB) {
            result = "Normal";
        } else if (actualH < minA) {
            result = "Deficiency";
        } else if (actualH > maxB) {
            result = "Excess";
        }

        System.out.println(result);
    }
}