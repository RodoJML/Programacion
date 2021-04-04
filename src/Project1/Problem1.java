/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Problem1 
{
    private float dollar;             // 500
    private float euro;               // 765
    private float colon;              // 1
    private float userUnits;          // User defines
    private float currencyFrom;       // Source currency
    private float currencyTo;         // Outcome currency

    public void setCurrencyFrom(float currencyFrom)
    {
        this.currencyFrom = currencyFrom;
    }

    public void setCurrencyTo(float currencyTo)
    {
        this.currencyTo = currencyTo;
    }
   
    public void setUserUnits(float userUnits) 
    {
        this.userUnits = userUnits;
    }

    public float getCurrencyTo() 
    {
        return currencyTo;
    }
    
    
    public float conversion()
    {
        dollar = 500;
        euro = 765;
        float conversion = 0f;
        
        if(currencyFrom == currencyTo)
            throw new Error("Incorrect selection same currency selected, no need to convert values!");
        
        if(currencyFrom == 1 && currencyTo == 2)
            conversion = (userUnits * 0.153f) + userUnits;
        
        if(currencyFrom == 1 && currencyTo == 3)
            conversion = userUnits * dollar ;
        
        if(currencyFrom == 2 && currencyTo == 1)
            conversion = userUnits / 1.53f ;
        
        if(currencyFrom == 2 && currencyTo == 3)
            conversion = userUnits * euro ;
        
        if(currencyFrom == 3 && currencyTo == 1)
            conversion = userUnits / 500;
            
        if(currencyFrom == 3 && currencyTo == 2)
            conversion = userUnits / 765;
        
        return conversion;
    }
}