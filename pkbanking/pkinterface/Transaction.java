package pkbanking.pkinterface;
import pkbanking.pkexception.*;

public interface Transaction
{
public int min_balance = 500;

public void withdraw(double amount)throws InSufficientFundsException;
public void deposit(double amount);
}

