import java.util.Scanner;
public class Ducks {
    public static void main(String[] args) {
        Ducks swimming = new Ducks();
        swimming.swim();
    }

    private void swim() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many little ducks went smimming? ");
        int ducks = myScanner.nextInt();
        String word = "ducks";

        for (int i = ducks; i > 0; i--) {
            System.out.println(i + " " + word + " went swimming one day ");
            System.out.println("over the hill and far away ");
            System.out.println("Mother duck said quack quack quack");
            if (i > 0) {
                System.out.println("and only " + (i - 1) + " little ducks came back!");
            }

                if (i == 1) {
                    System.out.println("and all her ducks came back");

                } else {
                    int newNum = i - 1; // this runs when i(the number we have input) has got to one)//
                    if (newNum == 1) {
                        word = "duck";
                    }
                    System.out.println(newNum + " " + word + " came back!");
                    System.out.println();
                }
            }
        System.out.println("all the little ducks came swimming back!");
        }
    }

