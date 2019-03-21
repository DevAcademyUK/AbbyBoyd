package banking;

import java.util.Scanner;

public class jointAcc {

    public String user = "user";
    private String password = "happy";
    private double balance =  122.23;
    Scanner input = new Scanner(System.in);

    //User has to provide different details from the main login to access the joint account.
    //so we have to log in again getting user input from the command line.
    protected void login() {
        System.out.println("enter username");
        String u= input.nextLine();
        System.out.println("enter the password ");
        String p= input.nextLine();
        if (this.user.equalsIgnoreCase(user) && this.password.equalsIgnoreCase(password)){
            System.out.println("Accepted!");

    }
    else {
            System.out.println("That is wrong, try again");
        }
    }

    private void setBalance() {

    }


}
