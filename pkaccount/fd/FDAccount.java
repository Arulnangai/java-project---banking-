package pkaccount.fd;
import pkaccount.Account;
import pkbanking.pkinterface.InterestRate;

public class FDAccount extends Account implements InterestRate
{
int period;
public FDAccount(int accnumber,int period,double balance)
{
super(accnumber,balance);
this.period = period;
System.out.println("Your new FD account number is"+ accnumber+ "with amount of Rs"+balance);
}
public double calc_interest()
{
return balance*period*fdrate/12;
}
public void close()
{
System.out.println("Your maturity amount is Rs. "+calc_interest()); 
}
}