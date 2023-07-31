import java.util.Scanner;

class ATM{
float Balance;
int PIN=8050;

public void checkpin(){
System.out.println("Enter you pin");
Scanner sc =new Scanner(System.in);
int epin=sc.nextInt();
if(epin==PIN){
System.out.println("Welcome to ATM");
menu();
}else{
System.out.println("Enter  a valid pin");
checkpin();
}

sc.close();
}
public void  menu(){
System.out.println("1.View Balance");
System.out.println("2.Deposite Amount");
System.out.println("3.Withdraw Amount");
System.out.println("4.Exit");
Scanner c=new Scanner(System.in);
System.out.println("Enter your choice");
int choose=c.nextInt();
if(choose==1){
checkBalance();
}else if(choose==2){
despositMoney();
}else if(choose==3){
withdrawMoney();

}else if(choose==4){

System.out.println("Available Balance is:"+Balance);
System.out.println("Take your card\n Thankyou for choosing Us");


}else{
System.out.println("enter a Valid Choice");
menu();
}
c.close();
}

public void checkBalance(){

System.out.println("Your Balance is "+Balance);

menu();

}
public void despositMoney(){
System.out.println("Enter the amount to deposit");
Scanner sc=new Scanner(System.in);
float amount=sc.nextFloat();
Balance=Balance+amount;
System.out.println("Amount deposited successfully");
menu();
sc.close();
}

public void withdrawMoney(){
Scanner wd=new Scanner(System.in);
System.out.println("Enter the amount to withdraw");
float amount=wd.nextFloat();
if(amount>Balance){
System.out.println("Insufficient Balance");
}else{
Balance = Balance-amount;
System.out.println("Money Withdrawal Successfully");

}
menu();
wd.close();
}

public static void main(String[] args){
ATM obj=new ATM();
obj.checkpin();
}
}

