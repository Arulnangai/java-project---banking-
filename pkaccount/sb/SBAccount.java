package pkaccount.sb;
import pkaccount.Account;
import pkbanking.pkinterface.*;
import pkbanking.pkexception.*;

public class SBAccount extends Account implements Transaction, InterestRate
{
public SBAccount()
{
super();
}
public SBAccount(int accnumber,double balance)
{
super(accnumber,balance);
System.out.println("Checking SB Account");
System.out.println("Your new SB account number is"+accnumber+"with amount of Rs"+balance);
}

public void deposit(double amount)throws IllegalArgumentException
{
if(amount>0)
{
System.out.println("Your current balance is Rs."+balance);
balance = balance+amount;
System.out.println("Your new account balance is  Rs."+balance);
}
else 
throw new IllegalArgumentException();
}

public void withdraw(double amount)throws InSufficientFundsException
{
if(balance-amount >= min_balance)
{
System.out.println("Your current balance is Rs."+balance);
balance = balance-amount;
System.out.println("Your new account balance is Rs."+balance);
}
else 
throw new InSufficientFundsException();
}

public void calc_interest()
{
System.out.println("Your current balance is "+balance);
balance = balance*sbrate/12;
System.out.println("Your new balance with interest is Rs."+balance);
}
}