/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;
interface Coffee{
    public void prepare();
}
class CoffeeA implements Coffee{
    @Override
    public void prepare()
    {
        System.out.println("Inside CoffeeA");
        System.out.println("Milk,caffein,suger added");
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        
    }
    
}
