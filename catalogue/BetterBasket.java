package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  /*@overide
  public String getDetails()
  {
      if (getQuantity() > 0)
     {
          
      }
    }
    */
       @Override
  public boolean add( Product pr )
  {    
      for(Product p: this)
      {
          if(p.getProductNum().equals(pr.getProductNum()))
          {
             p.setQuantity(p.getQuantity() + 1);
             return true;
            }
        }
    return super.add( pr );     // Call add in ArrayList
  }
  }

  // You need to add code here


