import java.util.Scanner;
public class Bank
{
    public static void transfer (int amount, Account from, Account to)
    {
        from.setMoney(from.getMomey()-amount);
        to.setMoney(to.getMomey()+amount);
    }
    public static void seeMoney (Account account1, Account account2)
    {
        System.out.println("Money on account1 = " + account1.getMomey());
        System.out.println("Money on account2 = " + account2.getMomey());
    }
    public static void putMoney (int amount, Account account)
    {
        account.setMoney(amount);
    }
    public static void main (String[]args)

    {
        Account account1 = new Account();
        Account account2 = new Account();
        System.out.println("set money on account1");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        putMoney(n,account1);
        System.out.println("set money on account2");
        int k = scanner.nextInt();
        putMoney(k,account2);
        seeMoney(account1,account2);
        System.out.println("How much money transfer from account1 to account2? ");
        int e = scanner.nextInt();
        transfer(e,account1,account2);
        seeMoney(account1,account2);
        System.out.println("How much money transfer from account2 to account1? ");
        int i = scanner.nextInt();
        transfer(i,account2,account1);
        seeMoney(account1,account2);
       }
}

 
