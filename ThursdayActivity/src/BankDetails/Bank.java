package BankDetails;

public class Bank {
	private String name;
	private int Accountnumber;
	private double balance;

	 Bank()
	{
		super();
	}

   Bank(String name,int Accountnumber,double balance)
 {
	this.name=name;
	this.Accountnumber=Accountnumber;
	this.balance=balance;
 }

public String getName() {
	return name;
}
public void setName(String name)
{
    this.name=name;	
}

public int getAccountnumber() 
{
	return Accountnumber;
}

public void setAccountnum(int accountnum) 
{
	this.Accountnumber = Accountnumber;
}
public double getBalance() 
{
	return balance;
}
public void setBalance(double balance)
{
	this.balance = balance;
}
}


