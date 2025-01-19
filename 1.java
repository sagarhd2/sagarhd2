package javafile;
import java.util.Scanner;
public class tempCodeRunnerFile {public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double balance=0;
    double withdrawal=0;
    double deposite=0;
    screen();
    boolean exit=true;
    while (exit) {
        System.out.print("enter :".toUpperCase());
        int user=input.nextInt();
        if (user==1) {
            System.out.println("your balance is -> ".toUpperCase()+"$"+balance);
            continue;       }
        else if (user==2) {
            System.out.print("enter the amount of withdrawal: ".toUpperCase());
            withdrawal=input.nextDouble();
            if (withdrawal>balance) {
                System.out.println("insufficient balance".toUpperCase());
            }
            else{
                balance=balance-withdrawal;
            System.out.println("your balance is now-> $"+balance);}
            continue;
            }
        
            
        else if (user==3){
            System.out.print("enter the amount to deposite: ".toUpperCase());
            deposite=input.nextDouble();
            balance=deposite+balance;
            System.out.println("your balance is -> %$"+balance);
         continue;}
        else if(user==4){
            exit=false;

        }    

        else {
            System.out.println("invalid input\nplease try again".toUpperCase());
            continue;
        }
    }
}
static void screen(){
    System.out.println("************");
    System.out.println("your bank details".toUpperCase());
    System.out.println("*************");
    System.out.println("1.balance\n2.withrawal\n3.deposite\n4.exit".toUpperCase());
    System.out.println("************");

    
    
}
}
