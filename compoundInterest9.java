import java.util.Scanner;

public class compoundInterest9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double principal;
        double rate;
        int timescompound;
        int years;
        double amount;

        System.out.println("Enter the principal amount:");
        principal=scanner.nextDouble();
        System.out.println("Enter the interest rate (in  %):");
        rate=scanner.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year:");
        timescompound=scanner.nextInt();
        System.out.println("Enter the # of years:");
        years=scanner.nextInt();

        amount=principal * Math.pow(1 + rate / timescompound, timescompound * years);

        // System.out.println("The amount after "+years+ " years is: $"+amount);
        // *******in order to format the output we can use printf().*******

        System.out.printf("The amount after %d years is $%.2f",years,amount);
          
        scanner.close();
    }
}
