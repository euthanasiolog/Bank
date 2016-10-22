import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piatrok on 19.10.16.
 */
class Account
{
  private int money;

  public void setMoney (int money)
  {
      this.money = money;
  }
  public  int getMoney ()
  {
    return money;
  }

    public void Transfer (int transfer, Account from, Account to)
    {
      from.setMoney(this.money-transfer);  
      to.setMoney(this.money+transfer);
    }
}
