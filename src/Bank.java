import java.util.Scanner;
public class Bank
{
    /**
     * Делает трансфер денег
     * @param amount сумма
     * @param from откуда
     * @param to куда
     */
    public static void transfer (int amount, Account from, Account to)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skol'ko babok perekinut'? ");
        amount = scanner.nextInt();
        from.setMoney(from.getMoney()-amount);
        to.setMoney(to.getMoney()+amount);
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

        System.out.println("Money on account1 = " + account1.getMoney());
        System.out.println("Money on account2 = " + account2.getMoney());

        int transfer;
        // перевод вводимой суммы с аккаунта1 на аккаунт2
        System.out.println("How much money transfer from account1 to account2? ");
        transfer = scanner.nextInt();

        System.out.println("Money on account1 = " + account1.getMoney());
        System.out.println("Money on account2 = " + account2.getMoney());

        // перевод вводимой суммы с аккаунта2 на аккаунт1
        System.out.println("How much money transfer from account2 to account1? ");
        transfer = scanner.nextInt();


        System.out.println("Money on account1 = " + account1.getMoney());
        System.out.println("Money on account2 = " + account2.getMoney());
    }
}
