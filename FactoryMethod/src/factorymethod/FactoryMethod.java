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
class CoffeeB implements Coffee{
    @Override
    public void prepare()
    {
        System.out.println("Inside CoffeeB");
        System.out.println("Milk,caffein added.No Suger");
    }
}
class CoffeeC implements Coffee{
    @Override
    public void prepare()
    {
        System.out.println("Inside CoffeeC");
        System.out.println("Milk,caffein,suger added");
    }
}
class CoffeeFactory{
    public Coffee ProduceCoffee(String Type)
    {
        if(Type.equals("CoffeeA"))
            return new CoffeeA();
        else if(Type.equals("CoffeeB"))
            return new CoffeeB();
        else if(Type.equals("CoffeeC"))
            return new CoffeeC();
        return null;
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        
    }
    
}
