/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimoCuartaClase;
import java.util.Date;


/**
 *
 * @author rodo
 */
public class ShoppingCart
{
    private Date dateCreated;
    private LineItem[] lines;
    private int lineCounter;

    /**
     * IMPORTANT!
     * Initializes the creation date on shopping cart and initializes the array "lines" up to 100 lines.
     */
    public ShoppingCart()
    {
        dateCreated = new Date();
        lines = new LineItem[100];
        lineCounter = 0;
    }
    
    public void addLine(LineItem line)
    {
        lines[lineCounter] = line;
        lineCounter++;
    }
    
    public Date getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public LineItem[] getLines() 
    {
        return lines;
    }

    public void setLines(LineItem[] lines) 
    {
        this.lines = lines;
    }
    
    
}
