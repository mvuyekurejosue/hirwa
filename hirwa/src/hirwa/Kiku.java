package hirwa;

import java.util.Scanner;
public class Kiku {
private static Scanner big;
private static Scanner alba;

public static void main(String[] args) {
    big = new Scanner(System.in);
   System.out.println("Loan business seeking loan calculation");

        System.out.println("Name of loan applicant");
        String name =  big.next();

        System.out.println("date of the loan");
        String date =  big.next();
        alba = new Scanner(System.in);
        System.out.println("principal amount request for");
        float amount = alba.nextInt();

        System.out.println("loan rate");
        
        float rate = alba.nextInt();

        System.out.println("loan  Repayment time");
        float time = alba.nextInt();

        System.out.println("Name of applicant is: " + name);
        System.out.println("date of the loan application is: " + date);
        System.out.println("loan amount is:" + amount);
        System.out.println("loan rate is:" + rate);
        System.out.println("loan repayment time is:" + time);

        float simpleinterest = (amount * rate * time);

        System .out. println("simple interest is: "+ simpleinterest );
        
       float backy = (simpleinterest * amount);

       System.out.println("simpleinterest is: "+ backy);

        
    
}
    
}

