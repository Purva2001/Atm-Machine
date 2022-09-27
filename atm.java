package com.company;

import java.util.*;

public class atm {
    public static void main(String[] args) {
        System.out.print("Enter Pin:");
        int balance = 5000, withdraw, deposit;
        try (Scanner s = new Scanner(System.in)) {
            int i=s.nextInt();

            if(i==2904) {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");
            }
            else {
                System.out.println("Wrong Pin");
            }


            while(true)
            {

                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
        }
    }

}
