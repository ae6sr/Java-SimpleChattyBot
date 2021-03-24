import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int heightOfPole = scanner.nextInt();
        int feetPerDay = scanner.nextInt();
        int feetPerNight = scanner.nextInt();

        int finalDay = 1 + (heightOfPole - feetPerNight - 1) / (feetPerDay - feetPerNight);

        System.out.println(finalDay);
    }
}