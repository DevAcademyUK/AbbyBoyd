import java.util.Scanner;
public class Ducks {
    public static void main(String[] args) {
        Ducks swimming = new Ducks();
        swimming.swim();
    }

    private void swim() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many little ducks went swimming? ");
        int ducks = myScanner.nextInt();

        String word = "ducks";
        for (int i = ducks; i > 0; i--) {
            System.out.println(i + " little " + word + " went swimming one day ");
            System.out.println("over the hill and far away ");
            System.out.println("Mother duck said quack quack quack quack");
            if (i == 1) {
                System.out.println("And all little ducks came swimming back!");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "duck";
                }

            }
        }
    }
}
