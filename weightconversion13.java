import java.util.Scanner;

public class weightconversion13 {
    public static void main(String[] args) {
        // Weight Conversion pounds to kilograms

        Scanner scanner=new Scanner(System.in);
        //Declare variable
        double weight;
        double newWeight;
        int choice;
        
        //welome message
        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        //prompt for use choice 
        System.out.println("Choose an option:");
        choice = scanner.nextInt();
        // System.out.println(choice);


        // option 1 convert 1lbs to kgs
        if(choice==1){
            System.out.println("Enter the weight in lbs:");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            // System.out.println("The new weight in kgs is:"+newWeight);
            System.out.printf("The new weight in kgs is:%.2f",newWeight);
            }


        //option 2 convert kgs to lbs
        else if(choice==2){
            System.out.println("Enter the weight in kgs:");
            weight=scanner.nextDouble();
            newWeight=weight*2.2042;
            System.out.printf("The new weight in lbs is:%.2f",newWeight);
        }


        // else print not a valid choice
        else{
        System.out.println("That was not a valid choice");
        }
    
    
    scanner.close();

    }
}
