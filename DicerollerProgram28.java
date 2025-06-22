import java.util.Random;
import java.util.Scanner;

public class DicerollerProgram28 {
    public static void main(String[] args) {
        //Java dice roller program
        Scanner scanner =new Scanner(System.in);
        Random random= new Random();
        int numofdice;
        int total=0;

        //Get number of dice from the user
        System.out.println("Enter the number of dice to roll: ");
        numofdice=scanner.nextInt();

        if(numofdice>0){
            System.out.println("\nNow, You roll the dice....");
            //Roll all the nice
            for(int i=0;i<numofdice;i++){
                int roll= random.nextInt(1,7);
                 System.out.println("Die " + (i+1) + ":");
                printDie(roll);
                System.out.println("You rolled: "+roll);
                System.out.println("-----------------------------------");
                total= total+roll;
            }
            //Get the total 
            System.out.println("Total: "+total);
            System.out.println("So we finally get the Sum  : "+total);
        }
        else{
            System.out.println("Number of dice must be greater than zero");
        }

        scanner.close();
    }
    //Display ASCII of dice

        static void printDie(int roll){
            String dice1="""
                      -------
                     |       |
                     |   *   |
                     |       |
                      -------

                    """;
            


             String dice2="""
                       -------
                     | *      |
                     |        |
                     |      * |
                       -------

                    """;

             String dice3="""
                       -------
                     |*       |
                     |   *    |
                     |      * |
                       -------

                    """;

             String dice4="""
                     -------
                    | *     * |
                    |         |
                    | *     * |
                      -------

                    """;


             String dice5="""
                     -------
                    | *     * |
                    |    *    |
                    | *     * |
                      -------

                    """;

             String dice6="""
                     -------
                     |  *   *  |
                     |  *   *  |
                     |  *   *  |
                      -------

                    """;

                switch (roll) {
                    case 1 ->System.out.println(dice1);
                    case 2 ->System.out.println(dice2);
                    case 3 ->System.out.println(dice3);
                    case 4 ->System.out.println(dice4);
                    case 5 ->System.out.println(dice5);
                    case 6 ->System.out.println(dice6);
                    default->System.out.println("Invalid roll");
                        }
        }
    
}















































