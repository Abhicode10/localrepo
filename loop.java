// Print the first n factorial numbers

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a given number");

        int n = SC.nextInt();
        int num = n;

        int Fact = 1;
        for(int i = 1; i<=n; i++){
            Fact = Fact * i;
            System.out.println("The factorial of " + i  +" : " +Fact);

        }
        
      
      System.out.println("The factorial of " +num +" is " +Fact);
        
      

    }
    
}
