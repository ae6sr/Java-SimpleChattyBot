import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int squirrels = scanner.nextInt();
        int totalNuts = scanner.nextInt();

        int extraNuts = totalNuts % squirrels;
        int usableNuts = totalNuts - extraNuts;
        int evenNuts = usableNuts / squirrels;

        System.out.println(evenNuts);
    }
}