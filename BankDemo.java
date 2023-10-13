import pkaccount.*;
import pkbanking.pkexception.*;
import pkcustomer.*;
import java.io.*;

class BankDemo
{
public static void main(String...arg)throws IOException
{
Customer c[]= new Customer[5];
int choice1,choice2;
int cid,i=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Welcome to Anu's Bank");
do
{
System.out.println("To SB account --> 1");
System.out.println("To FD account --> 2");
System.out.println("To Exit--> 3");
System.out.println("Enter your choice: ");
choice1 = Integer.valueOf(br.readLine());

if (choice1 == 1)
{
do
{
System.out.println("To SB new account --> 1");
System.out.println("To Withdraw --> 2");
System.out.println("To Deposit --> 3");
System.out.println("To Calculate Interest --> 4");
System.out.println("To Exit --> 5");
System.out.println("Enter your choice : ");
choice2 = Integer.valueOf(br.readLine());

switch(choice2)
{
case 1:
	System.out.println("Enter your name,address : ");
	String name = br.readLine();
	String address = br.readLine();
	c[i]= new Customer(i,name,address);
	c[i].createAccount(1);
	System.out.println("Customer ID is "+ i++);
	break;

case 2:
	try
{
	System.out.println("Enter Customer id : ");
	cid = Integer.valueOf(br.readLine());
	c[cid].Transaction(1);
}catch(InSufficientFundsException ife)
{
System.out.println(ife);
}
	break;

case 3:
try{	
System.out.println("Enter Customer id : ");
	cid = Integer.valueOf(br.readLine());
	c[cid].Transaction(2);
}catch(InSufficientFundsException ife)
{
System.out.println(ife);
}
	break;

case 4:
try{
	System.out.println("Enter Customer id : ");
	cid = Integer.valueOf(br.readLine());
	c[cid].Transaction(3);	
	break;
}catch(InSufficientFundsException ife)
{
System.out.println(ife);
}

case 5:
	break;

default:
	System.out.println("Invalid Choice");	

}
}while(choice2!=5);
}

else if(choice1 == 2)
{
do
{
System.out.println("To create New FD account -->1");
System.out.println("To close the FD account -->2");
System.out.println("To Exit --> 3");
System.out.println("Enter your choice : ");
choice2 = Integer.valueOf(br.readLine());

switch(choice2)
{
case 1:
	System.out.println("Enter your name,address : ");
	String name = br.readLine();
	String address = br.readLine();
	c[i]= new Customer(i,name,address);
	c[i].createAccount(2);
	System.out.println("Customer ID is "+ i++);
	break;
case 2: 
	try
{
System.out.println("Enter Customer id : ");
	cid = Integer.valueOf(br.readLine());
	c[cid].Transaction(4);
}catch(InSufficientFundsException ife)
{
System.out.println(ife);
}	
	break;

case 3:
	break;

default:
	System.out.println("Invalid Choice");	
}
}while(choice2!=3);
}
else 
	System.out.println("Thank you for banking with us..! ");
}while(choice1!=3);
}
}
	