public class Bank
{
    private String name;
    private int bal;
    int count;
    String stat = "";
    public void setDetails(String n,int b)
    {
        name=n;
        bal=b;
        count=0;
    }
    public void Deposit(int w)
    {
        bal+=(w>=0)?w:0;
        count+=(w>=0)?1:0;
        System.out.println((w>=0)?"Deposit done....\n"+"Amount: "+w:"Deposit amount must be a natural number");
        stat+=(w>=0)?" Deposit done for amount : "+w+"\n":"";
    }
    public void Withdrawal(int d)
    {
        System.out.println((d>=0)?((bal<d)?"Insufficient balance....\n"+"Request for "+d+" could not be completed!":"Withdrawal done....\n"+"Amount withdrawn: "+d):("Withdrawal must be a natural number!"));
        stat+=(bal>=d&&d>=0)?" Withdrawal done for amount : "+d+"\n":"";
        count+=(bal>=d&&d>=0)?1:0;
        bal-=(bal>=d&&d>=0)?d:0;
    }
    public void checkDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Your balance is: "+bal);
    }
    public void getStatement()
    {
        System.out.println("Total no. of entries in pass book is: "+count);
        System.out.println(stat);
        System.out.println("Final balance :====="+bal);
    }
}