package clients.cashier;

import catalogue.Basket;
import catalogue.BetterBasket;
import catalogue.Product;
import debug.DEBUG;
import middle.*;

import java.util.Observable;


/**
 * Write a description of class CashierBetterModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashierBetterModel extends CashierModel
{
   public CashierBetterModel(MiddleFactory mf)
   {
   super(mf);
    }
       @Override
     protected Basket makeBasket()
  {
    return new BetterBasket();
  }
}
