package BankDetails;

public class BankDetails
{
	private Bank[] account;
    private int entry;
    
     BankDetails() 
    {
  	  account=new Bank[4];
    }
   void checkBalance(Bank input)
  	{
  		if(entry<account.length)
  		{
  			account[entry]=input;
  			entry++;
  			
  			if(input.getBalance()<(10000))
         System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance());
  		}
  	}
    
	public static void main(String[] args)
	{
		Bank b1=new Bank("shireesha",3825,50000);
		Bank b2=new Bank("navnit",0347,60000);
		Bank b3=new Bank("sony",3845,80000);
		Bank b4=new Bank("naveen",4832,150000);

	    BankDetails myBank = new BankDetails();
 
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);

	}

}

