import java.util.Random;
import java.util.HashMap;

public class TheUniversalBankOfJava
{
    Random r = new Random();
    String Name;
    final int AccountNum = r.nextInt(900)+100;
    int Balance;
    HashMap<String, Integer> transactions = new HashMap<String, Integer>();
    int i = 0;
    public void setDetails(String setterName, int initialBalance)
    {
        Name = setterName;
        Balance = initialBalance;
    }
    
    public void getDetails()
    {
        System.out.println("Name: "+Name);
        System.out.println("Account Number: "+AccountNum);
        System.out.println("Balance: "+Balance);
    }
    
    public void withdrawal(int amountW)
    {
        if(amountW>Balance){
            throw new ArithmeticException("Insufficient Balance!");
        }
        else{
            Balance = Balance - amountW;
            transactions.put("Withdrawal: ", amountW);
        }
    }
    
    public void deposit(int amountD)
    {
        Balance = Balance + amountD;
        transactions.put("Deposit: ", amountD);
    }
    
    public void getTransactionHistory()
    {
        for (String i : transactions.keySet()) {
          System.out.println( i + " : " + transactions.get(i));
        }
    }
}
