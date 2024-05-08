package task3;

import java.util.Scanner;

class ATM{

    float balance;
    int PIN = 2345;
    public Scanner sc = new Scanner(System.in);

    public void checkPin(){
        System.out.println("Enter your PIN: ");
        int userPin = sc.nextInt();
        if (userPin == PIN){
            menu();
        }
        else{
            System.out.println("Incorrect pin");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        int choice = sc.nextInt();

        if(choice==1)
            checkBalance();
        else if(choice==2)
            withdrawMoney();
        else if(choice==3)
            depositMoney();
        else if(choice==4)
            System.exit(0);
        else
            System.out.println("Enter a valid number!");
            menu();
    }

    public void checkBalance(){
        System.out.println("Your current balance is " + balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient Balance!");
            menu();
        }
        else{
            balance -= amount;
            System.out.println("Amount withdrawn succesfully!");
            menu();
        }
    }

    public void depositMoney(){
        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Amount deposited succesfully!");
        menu();
    }

}


class ATMMachine{
    public static void main(String [] args){
        ATM person = new ATM();
        person.checkPin();
    }
}
