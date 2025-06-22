
// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class BankingProgram27 {
   static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM FOR BEGINNERS


        // DECLARE VARIBLES
        double balance=0;
        boolean isRunning=true;
        int choice;
        while(isRunning){
        // DISPLAY MENU
        System.out.println("********************");
        System.out.println("BANKINGF PROGRAM");
        System.out.println("*********************");
        System.out.println("1. Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("**********************");

        //GET AND PROCESS USERS CHOICE
        System.out.println("Enter yOur choice(1-4)");
        choice=scanner.nextInt();

        switch(choice){
            //showBalance
                case 1 ->showBalance(balance);
                //DEPOSIT()
                case 2-> balance=balance+deposit();
                //withdraw()
                case 3-> balance = balance - withdraw(balance);
                case 4-> isRunning=false;
                default -> System.out.println("Invalid Choice");
        }
    }
        //EXIT MESSAGE
        System.out.println("*********************************");
        System.out.println("Thank you! Have a nice day");
        System.out.println("*********************************");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("***********************");
       System.out.printf("$%.2f\n",balance); 
    }

    static double deposit(){
        double amount;
        System.out.println("Enter an amount to  be deposited: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount cant be negative");
         return 0;
        }
        else{
            return amount;
        }   
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn: ");
        amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
