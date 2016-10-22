import java.util.Scanner;

/**
 * Created by Piatrok on 19.10.16.
 */
public class Bank
{   
    /**
    *Делает трасфер
    * amount - сумма
    * from - to  откуда - куда
    */
    public void transfer (int amount, Account from, Account to)
    {
        //тут пиши код перевода
    }
    
    public static void main (String[]args)

    {
        // создаю аккаунт1 и зачисляю вводимые из консоли средства
        Account account1 = new Account();
        System.out.println("set money on account1");
        Scanner scanner = new Scanner(System.in);
        account1.setMoney(scanner.nextInt());

        // создаю аккаунт2 и зачисляю вводимые из консоли средства
        Account account2 = new Account();
        System.out.println("set money on account2");
        account2.setMoney(scanner.nextInt());

        System.out.println("Money on account1 = " + account1.getMomey());
        System.out.println("Money on account2 = " + account2.getMomey());

        // перевод вводимой суммы с аккаунта1 на аккаунт2
        System.out.println("How much money transfer from account1 to account2? ");
        int transfer1 = scanner.nextInt();
        //и заменяешь методом те строки, во втором случае так же
        transfer (transfer1, account1, account2);

        System.out.println("Money on account1 = " + account1.getMomey());
        System.out.println("Money on account2 = " + account2.getMomey());

        // перевод вводимой суммы с аккаунта2 на аккаунт1
        System.out.println("How much money transfer from account2 to account1? ");
        int transfer2 = scanner.nextInt();
        account1.Transfer(transfer2);
        account2.Transfer(-transfer2);

        System.out.println("Money on account1 = " + account1.getMomey());
        System.out.println("Money on account2 = " + account2.getMomey());
       }
}
