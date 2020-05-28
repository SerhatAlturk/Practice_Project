package Replits.TJMaxx;


import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx
{

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx()
    {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Item item)
    {
        regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item)
    {
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public ArrayList<Item> getRegularItems()
    {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems()
    {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount()
    {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount()
    {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames()
    {
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < regularItemsCount(); i++)
        {
            temp.add(regularItems.get(i).getName());
        }
        for(int i = 0; i < onSaleItemsCount(); i++)
        {
            temp.add(onSaleItems.get(i).getName());
        }
        return temp;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        double temp = 0.0;
        for(int i = 0; i < regularItemsCount(); i++)
        {
          if(regularItems.get(i).getCatalogNumber() == catalogNumber)
          {
              temp = regularItems.get(i).getPrice();
          }
        }
        for(int i = 0; i < onSaleItemsCount() ; i++)
        {
            if(onSaleItems.get(i).getCatalogNumber() == catalogNumber)
            {
                temp = onSaleItems.get(i).getPrice();
            }
        }
        return temp;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        OnSaleItem temp = null;
        for(int i = 0; i < onSaleItemsCount(); i++)
        {
            if(onSaleItems.get(i).getName().equals(name))
            {
                temp = onSaleItems.get(i);
            }
        }
        return temp;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber)
    {
        for(int i = 0; i < regularItemsCount(); i++)
        {
            if(regularItems.get(i).getCatalogNumber() == catalogNumber)
            {
                regularItems.remove(i);
            }
        }
        for(int i = 0; i < onSaleItemsCount(); i++)
        {
            if(onSaleItems.get(i).getCatalogNumber() == catalogNumber)
            {
                onSaleItems.remove(i);
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber below method is already completed
     */
    public void buyItem(int catalogNumber)
    {
        for(Item c : regularItems)
        {
            if(c.getCatalogNumber() == catalogNumber)
            {
                int q = c.getQuantity() - 1;
                if(q == 0)
                {
                    removeItem(c.getCatalogNumber());
                }
                else
                {
                    c.setQuantity(q);
                }
                break;
            }
        }

        for(Item s : onSaleItems)
        {
            if(s.getCatalogNumber() == catalogNumber)
            {
                int qo = s.getQuantity() - 1;
                if(qo == 0)
                {
                    removeItem(s.getCatalogNumber());
                }
                else
                {
                    s.setQuantity(qo);
                }
                break;
            }
        }


    }

}

