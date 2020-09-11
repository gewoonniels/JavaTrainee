package h4;

import java.util.Scanner;

public class Lab4 {

    public void checkAccountNumber(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter accountnumber");

        String accountNumber = scanner.nextLine();  // Read user input
        System.out.println(accountNumber);

        int multiplieBy = accountNumber.length();
        int total = 0;

        for (int i = 0; i < accountNumber.length(); i++){
            int selectedNumber = Integer.parseInt(accountNumber.substring(i,i +1));
            total += (selectedNumber * multiplieBy);
            multiplieBy--;
        }

        if(total % 11 == 0){
            System.out.println("This is a valid bankaccount");
        } else {
            throw new IllegalArgumentException();
        }
    }

}
