package IDCode;

import java.util.Scanner;
//Project
public class Account {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempBalance = 10000;
        int balance = tempBalance;
        int withdraw, deposit;

        System.out.printf("Account Management:  \n" +
                " 1. Balance \n" +
                " 2. Deposit \n" +
                " 3. Withdraw \n" +
                " 4. Exit \n");

        Account obj = new Account();

        for (int i=1; i<100; i++){

            int number = in.nextInt();
            if (number == 1){
                System.out.printf("\nCurrent Balance: %d", balance);
            }
            else if (number == 2){
                System.out.printf("Deposit Amount: ");
                deposit = in.nextInt();
                obj.Fordeposit( balance, deposit);
            }
            else if (number == 3){
                System.out.printf("Withdraw Amount: ");
                withdraw = in.nextInt();
                obj.Forwithdraw( balance, withdraw);
                //System.out.printf("%d   %d",withdraw , balance);

            }
            else if (number == 4){
                System.out.printf("---- Exit From The Account ----\n" +
                                  "----       Thanks you      ----");
                break;
            }
            System.out.println();
        }


    }
    // Deposit
    public void Fordeposit (int balance, int deposite){
        balance = balance + deposite;
        System.out.printf("New Balance: %d", balance);

    }
    // Withdraw
    public void Forwithdraw (int balance, int withdraw ){
        balance = balance - withdraw;
        System.out.printf("New Balance: %d",balance);

    }
}
