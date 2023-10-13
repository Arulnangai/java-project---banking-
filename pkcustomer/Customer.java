package pkcustomer;
import pkaccount.sb.SBAccount;
import pkaccount.fd.FDAccount;
import pkbanking.pkexception.*;
import java.io.*;

public class Customer
{

int cust_id;
String name,address;
SBAccount sb;
FDAccount fd;
static int sbaccno = 5001, fdaccno = 8001;

public Customer(int cust_id,String name, String address)
{
this.cust_id = cust_id;
this.name= name;
this.address = address;
}

public void createAccount(int type)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

if(type == 1)
{
System.out.println("Enter initial amount to create new SB account : ");
double amount = Double.valueOf(br.readLine());
sb = new SBAccount(sbaccno++,amount);
}

else if(type ==2)
{
System.out.println("Enter amount,period to create new FD account : ");
double amount = Double.valueOf(br.readLine());
int period = Integer.valueOf(br.readLine());
fd = new FDAccount(fdaccno++,period,amount);
}

else
System.out.println("Invalid Type");
}

public void Transaction(int type)throws InSufficientFundsException,IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

if(type ==1 )
{
try{
System.out.println("Enter amount to withdraw : ");
double amount = Double.valueOf(br.readLine());
sb.withdraw(amount);
}catch(InSufficientFundsException ife)
{
throw ife;
}
}

else if(type ==2)
{
System.out.println("Enter amount to deposit :  ");
double amount = Double.valueOf(br.readLine());
sb.deposit(amount);
}

else if(type ==3)
sb.calc_interest();

else if(type == 4)
fd.close();

else
System.out.println("Invalid choice");
}
}