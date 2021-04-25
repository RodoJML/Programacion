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
public class Product 
{
    private String ID;
    private String name;
    private String supplier;

    public Product(String ID, String name, String supplier) {
        this.ID = ID;
        this.name = name;
        this.supplier = supplier;
    }
    
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    
}
