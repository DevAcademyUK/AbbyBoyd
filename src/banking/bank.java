package banking;


import java.util.Scanner;

public class bank { //create the main class banking
    Scanner  input = new Scanner(System.in);/*calling the scanner class-making a new scanner which you store
                                              in the variable "input"..this can be called anything */
    private String name = "";
    public String user_name="Abby";
    private int balance =90;
    private  String password="123";

    public bank(){ //constructor is first that the compiler
    balance = 544364656;

    }

    private void checkBalance() {
        System.out.println(balance);
    }

    //When we first launch the program we are prompted to log in to our account.
    public  void login() {
        System.out.println("enter username");
        name = input.nextLine();
        System.out.println("enter the password ");
        String p= input.nextLine();

        if (this.user_name.equalsIgnoreCase(user_name)&& this.password.equalsIgnoreCase(password)){
            System.out.println("Welcome " + name );
        }
        else{
            System.out.println("go away ");
        }


    }

    //start of the program
    public static void main(String[] args) {
        // launching method
        bank newBank = new bank(); //creating a new instance
        newBank.login(); // call login method
        newBank.mainMenu();

    }

    //main menu, used to ask user what account they want to access.
    protected void mainMenu() {
        System.out.println("Which account do you want to access?..Joint or Personal?");
        String account = input.nextLine(); //user enters the account they want to access
        checkInput(account); //go to check input, pass over the user input
    }

    //used to work out which account the user wants to work with.
    private void checkInput(String account) {
    if(account.equalsIgnoreCase("Joint")){ //if user entered 'joint' then
        jointAcc ja = new jointAcc(); //create a new instance of jointAcc called 'ja'
        ja.login(); //call the login method from the jointAcc class
    }
     personalAccount personal = new personalAccount();


    }


}
