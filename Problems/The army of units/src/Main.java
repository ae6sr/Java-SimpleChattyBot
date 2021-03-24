import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        String result = null;

        if (army < 1) {
            result = "no army";
        } else if (army > 0 && army < 20) {
            result = "pack";
        } else if (army > 19 && army < 250) {
            result = "throng";
        } else if (army > 249 && army < 1000) {
            result = "zounds";
        } else if (army > 999) {
            result = "legion";
        }

        System.out.println(result);
    }
}