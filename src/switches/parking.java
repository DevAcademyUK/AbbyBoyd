package switches;
import java.util.Scanner;

public class parking {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        parking p = new parking(); //creating new instance of parking class
        p.getInput(); // calling the method below
    }

        private void getInput () {
            System.out.println("what day is it?");
            String day = myScanner.nextLine();
            System.out.println("How long will you be staying?");
            int duration = Integer.parseInt(myScanner.nextLine());
            System.out.println("What position do you hold within the college? Staff/Student/Visitor");
            String position = myScanner.nextLine();
            calculateFees(day, duration, position);
        }

        private void calculateFees (String day,int duration, String position){
            int cost;
            int hourlyRate;
            int multiplier;

            switch (position) {
                case "Staff":
                    multiplier = 2;
                    break;

                case "student":
                    multiplier = 1;
                    break;

                case "visitor":
                    multiplier = 3;
                    break;

                default:
                    System.out.println("Invalid input for position, abortion, please retry.");
                    getInput();

            }
            switch (day) {
                case "Monday":
                    hourlyRate = 2;
                    break;

                case "Tuesday":
                    hourlyRate = 2;
                    break;

                case "Wednesday":
                    hourlyRate = 3;
                    break;

                case "Thursday":
                    hourlyRate = 2;
                    break;

                case "Friday":
                    hourlyRate = 3;
                    break;

                case "Saturday":
                    hourlyRate = 4;
                    break;

                case "Sunday":
                    hourlyRate = 5;
                    break;

            }
        }
    }


