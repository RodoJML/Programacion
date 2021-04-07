/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Problem2
{
    private float currency0value;
    private float currency1value;
    private String currency0name;
    private String currency1name;
    private float userUnits;
    private byte currencyFrom;
    private byte currencyTo;

    public void setCurrency0value(float currency0value)
    {
        this.currency0value = currency0value;
    }

    public void setCurrency1value(float currency1value)
    {
        this.currency1value = currency1value;
    }

    public void setCurrency0name(String currency0name)
    {
        this.currency0name = currency0name;
    }

    public void setCurrency1name(String currency1name)
    {
        this.currency1name = currency1name;
    }

    public void setUserUnits(float userUnits)
    {
        this.userUnits = userUnits;
    }

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

    public float getCurrency0value() {
        return currency0value;
    }

    public float getCurrency1value() {
        return currency1value;
    }

    public String getCurrency0name() {
        return currency0name;
    }

    public String getCurrency1name() {
        return currency1name;
    }

    public float getUserUnits() {
        return userUnits;
    }

    public byte getCurrencyFrom() {
        return currencyFrom;
    }

    public byte getCurrencyTo() {
        return currencyTo;
    }
    
    public float conversion()
    {
        float conversion = 0;
        float equivalent = 0;
        
        if(currency0value > currency1value)
            equivalent = 1 - (currency0value / currency1value);
        else
            equivalent = 1 - (currency1value / currency0value);
        
        if(currencyFrom == currencyTo)
            throw new Error("Incorrect selection same currency selected, no need to convert values!");
        
        if(currencyFrom == 1 && currencyTo == 2)
            conversion = (userUnits * equivalent) + userUnits;
        
        if(currencyFrom == 1 && currencyTo == 3)
            conversion = userUnits * currency0value;
        
        if(currencyFrom == 2 && currencyTo == 1)
            conversion = userUnits / equivalent;
        
        if(currencyFrom == 2 && currencyTo == 3)
            conversion = userUnits * currency1value;
        
        if(currencyFrom == 3 && currencyTo == 1)
            conversion = userUnits / currency0value;
            
        if(currencyFrom == 3 && currencyTo == 2)
            conversion = userUnits / currency1value;
        
        return conversion;
    }
}
