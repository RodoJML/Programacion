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
public class Tester
{
    public static void main(String[] args) 
    {
        Customer c1 = new Customer("Rodo", "San Jose", "rodojml@me.com", "1234", "San Jose", 5000f);
        
        Product product1 = new Product("1", "Reloj", "Casio");
        LineItem line1 = new LineItem(1,344f,product1);
        
        Product product2 = new Product("1", "Mac", "Apple");
        LineItem line2 = new LineItem(1,1000f,product2);
        
        ShoppingCart cart = c1.getCart();
        cart.addLine(line1);
        cart.addLine(line2);
    }
}
