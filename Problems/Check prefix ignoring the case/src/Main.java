import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        str1 = str1.toLowerCase();

        System.out.println(str1.startsWith("j"));
    }
}