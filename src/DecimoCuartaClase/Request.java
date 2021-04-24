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
public class Request
{
    private int orderID;
    private String dateCreated;
    private String dateShipped;
    private String customerName;
    private String customerID;
    private String status;
    private String shippingID;
    
    public void placeOrder()
    {
        
    }

    public int getOrderID() 
    {
        return orderID;
    }

    public void setOrderID(int orderID) 
    {
        this.orderID = orderID;
    }
    
    // Methods get and set

    public String getDateCreated() 
    {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() 
    {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) 
    {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerID() 
    {
        return customerID;
    }

    public void setCustomerID(String customerID) 
    {
        this.customerID = customerID;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getShippingID() 
    {
        return shippingID;
    }

    public void setShippingID(String shippingID) 
    {
        this.shippingID = shippingID;
    }
    
    
}
