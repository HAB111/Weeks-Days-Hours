package Problem3Account;

public class Account
{   private String id;
    private String name;
    private double balance;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, double balance)
    {
        this.id      = id;
        this.name    = name;
        this.balance = balance;
    }
    public String getId()
    {

        return id;
    }
    public String getName()
    {

         return name;
    }
    public double getBalance()
    {

        return balance;
    }

    public void credit(double x)
    {
        this.balance += x;
    }
    public boolean debit(double b)
    {
       boolean f = false;
        if(this.balance >= b)
       {
           this.balance -= b;
           f = true;
       }

       else if(this.balance < b)
       {
           System.out.println("Amount exceeded");
           f =false;
       }
       return f;
    }

    public void transferTo(Account another, double amount)
    {
        if (debit(amount)==true)
        {
            another.balance += amount;
            System.out.println("Transfer complete");
        }
        else if(debit(amount)==false)
        {
            System.out.println("Amount exceeded");
        }
    }
    public String accountDetails()
    {
        String a;
        a = name + ", the current balance in your account " + id + " is " + balance;

        return a;
    }

}
