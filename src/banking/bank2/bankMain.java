package banking.bank2;
import com.sun.source.tree.WhileLoopTree;
import games.Math;

import java.util.Scanner;
public class bankMain {

   private String userName = "Abby";
   private String password = "Hello";

   private double cAccount = 100.00;
   private double jAccount = 985.00;
   private double sAccount = 68;

   Scanner myScanner = new Scanner(System.in);

   public static void main(String[] args) {

      bankMain details = new bankMain();
      details.login();
   }

   private void login() {
      System.out.println("Type in your username");
      String user = myScanner.nextLine();
      System.out.println("Please enter your password");
      String pass = myScanner.nextLine();
      if (user.equalsIgnoreCase(userName) && pass.equalsIgnoreCase(password)) {
         System.out.println("Correct, what account would you like to access? Checking, joint or savings? ");
      } else {
         System.out.println("Incorrect. Try again");

      }
   }

   private void menu() {
      System.out.println("Checking, Joint or Savings?");
      String choice = myScanner.nextLine();
      if (choice.equalsIgnoreCase("checking")) {
         bankMain checking = new bankMain();
         checking.getValues();

         if (choice.equalsIgnoreCase("Joint")) {
            private void Joint ();
            if (choice.equalsIgnoreCase("Savings")) {
               private void Savings ();
            }


         }
      }
   }
   private void getValues() {
      System.out.println("Check balance?");
      String answer = myScanner.nextLine();
      if (answer.equalsIgnoreCase("Yes"));
      System.out.print(cAccount);
      if (answer.equalsIgnoreCase("No"));
      System.out.print(menu();)

   }
}

