package pkaccount;

public class Account
{
protected int accnumber;
protected double balance;
 
public Account()
{
this.accnumber =0;
this.balance =0;
}
public Account(int accnumber,double balance)
{
this.accnumber= accnumber;
this.balance = balance;
System.out.println("Checking Account");
}
}