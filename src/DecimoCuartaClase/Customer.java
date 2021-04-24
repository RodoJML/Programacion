/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimoCuartaClase;

/**
 *
 * @author rodo
 */
public class Customer extends User
{
    private String customerName;
    private String address;
    private String email;
    private String creditCardInfo;
    private String shippingInfo;
    private float accountBalance;
    
    public Customer(String customerName, String address, String email, String creditCardInfo,  String shippingInfo, float accountBalance)
    {
        
    } 
    public void register()
    {
        
    }
    
    public void login()
    {
        
    }
    
    public void updateProfile()
    {
        
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getCreditCardInfo() 
    {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) 
    {
        this.creditCardInfo = creditCardInfo;
    }

    public String getShippingInfo() 
    {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) 
    {
        this.shippingInfo = shippingInfo;
    }

    public float getAccountBalance() 
    {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) 
    {
        this.accountBalance = accountBalance;
    }
 
    
}
