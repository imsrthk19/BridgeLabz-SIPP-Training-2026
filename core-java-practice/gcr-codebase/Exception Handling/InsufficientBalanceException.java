public class InsufficientBalanceException extends Exception{
    double Balance;
    double WithdrawAmount;

public InsufficientBalanceException(double balance, double withdrawAmount){
    this.Balance = balance;
    this.WithdrawAmount= withdrawAmount;
}

@Override   //Custom Exception
public String getMessage(){
      return "Insufficient Balance!\n Balance Amount:- "+ Balance+ "\nWithdraw Amount:- "+ WithdrawAmount;
}
}