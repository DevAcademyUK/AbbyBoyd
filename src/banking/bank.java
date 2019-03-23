package banking;

import java.util.Scanner;

public class bank { //create the main class banking
    Scanner input = new Scanner(System.in);/*calling the scanner class-making a new scanner which you store
                                              in the variable "input"..this can be called anything */
    public String user_name = "Abby";
    private int balance = 90;
    private String password = "123";//variables stored with data values

    public bank() { //constructor is first
        balance = 544364656;//what you want the computer to print out

    }

    private void checkBalance() {
        System.out.println(balance);
    }

    //When we first launch the program we are prompted to log in to our account.
    public void login() {
        System.out.println("enter username");
        String name = input.nextLine();
        System.out.println("enter the password ");
        String p = input.nextLine();

        if (name.equalsIgnoreCase(user_name) && (p.equalsIgnoreCase(password))) {
            System.out.println("Welcome " + name);
            this.mainMenu();
        } else {
            System.out.println("Not accepted");

        }
    }

    //start of the program
    public static void main(String[] args) {
        // launching method
        bank newBank = new bank(); //creating a new instance
        newBank.login(); // call login method


    }

    protected void mainMenu() {
        System.out.println("Which account do you want to access?..Joint or Personal?");
        String account = input.nextLine(); //user enters the account they want to access
        this.checkInput(account); //go to check input, pass over the user input
    }


    //used to work out which account the user wants to work with.
    private void checkInput(String account) {
        if (account.equalsIgnoreCase("Joint")) { //if user entered 'joint' then
            jointAcc ja = new jointAcc(); //create a new instance of jointAcc called 'ja'
            ja.login(); //call the login method from the jointAcc class
        } else if (account.equalsIgnoreCase("personal")) {
            jointAcc personal = new jointAcc();
            personal.login();
        } else {
            System.out.println(account + " not recognised, returning to menu");
        }


    }


}
