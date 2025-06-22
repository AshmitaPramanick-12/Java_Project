import java.util.Scanner;

public class tempconvert15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double temp;                                                                   
        double newtemp;
        String unit;


        System.out.println("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit?(C or F): ");
        unit= scanner.next().toUpperCase();
        
        // System.out.println(temp);
        // System.out.println(unit);

        // variable =(condition)? ifTrue: ifFalse;--->ternary operators
        newtemp=(unit.equals("C"))?(temp-32)*5/9:(temp* 5/9)+32;

        // System.out.println(newtemp+"°"+unit);  
        //OR
        System.out.printf("%.1f°%s",newtemp,unit);

        scanner.close();
    }
}
