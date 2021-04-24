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
public class LineItem
{
    private Integer quantity;
    private float price;
    private Product product;

    public LineItem(Integer quantity, float price, Product product)
    {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    
    public Integer getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(Integer quantity) 
    {
        this.quantity = quantity;
    }

    public float getPrice() 
    {
        return price;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }
    
    
    
}
