package secondexcercise;

public class AccountBO {
	String s[];
	
	public FixedAccount getAccountDetail(String detail)  {
      String s[]=detail.split(",",5);
      FixedAccount ACBO =new FixedAccount();
      String AccountNumber=s[0];
      ACBO.setAccountNumber(AccountNumber);
      double Balance=Double.parseDouble(s[1]);
      ACBO.setBalance(Balance);
      String AccountName=s[2];
      ACBO.setAccountHolderName(AccountName);
      double MinBalance=Double.parseDouble(s[3]);
      ACBO.setMinimumBalance(MinBalance);
      int LockingPeriod=Integer.parseInt(s[4]);
      ACBO.setLockingPeriod(LockingPeriod);
      
        return ACBO;
	}

	
	
	
	
	
}
