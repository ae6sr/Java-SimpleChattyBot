import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        String result;

        if (num1 > 0) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);
    }
}