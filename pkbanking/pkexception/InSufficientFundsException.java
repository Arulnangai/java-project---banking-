package pkbanking.pkexception;

public class InSufficientFundsException extends Exception
{
String description;
public InSufficientFundsException()
{
description ="InSufficient Funds";
}
public InSufficientFundsException(String description)
{
this.description = description;
}
public String toString()
{
return "Insufficient Funds Exception"+description;
}

}