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
    private short dollar;            // 500
    private short euro;              // 765
    private float userUnits;         // User defines
    private byte currencyFrom;       // Source currency
    private byte currencyTo;         // Outcome currency

    public void setCurrencyFrom(byte currencyFrom)
    {
        if(currencyFrom < 1 || currencyFrom > 3)
            throw new IllegalArgumentException("This is not a currency option");
        this.currencyFrom = currencyFrom;
    }

    public void setCurrencyTo(byte currencyTo)
    {
        if(currencyFrom < 1 || currencyFrom > 3)
            throw new IllegalArgumentException("This is not a currency option");
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
        float conversion = 0;
        
        if(currencyFrom == currencyTo)
            throw new Error("Incorrect selection same currency selected, no need to convert values!");
        
        if(currencyFrom == 1 && currencyTo == 2)
            conversion = (userUnits * 0.153f) + userUnits;
        
        if(currencyFrom == 1 && currencyTo == 3)
            conversion = userUnits * dollar;
        
        if(currencyFrom == 2 && currencyTo == 1)
            conversion = userUnits / 1.53f;
        
        if(currencyFrom == 2 && currencyTo == 3)
            conversion = userUnits * euro;
        
        if(currencyFrom == 3 && currencyTo == 1)
            conversion = userUnits / dollar;
            
        if(currencyFrom == 3 && currencyTo == 2)
            conversion = userUnits / euro;
        
        return conversion;
    }
}