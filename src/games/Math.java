package games;
import java.util.Scanner;

public class Math {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Math multi = new Math();
        multi.getValues();
    }

    private void getValues() {
        System.out.println("What number would you like the multiplication for?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you wish to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier);
    }

    private void calculate(int number, int multiplier) {
        for (int i = 1; i <= multiplier; i++) {
            System.out.println(i + " times " + number + " is " + i * number);
        }
    }
}

