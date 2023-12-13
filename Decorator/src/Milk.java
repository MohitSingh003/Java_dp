public class Milk extends CoffeeDecorator {

    Coffee baseCoffee;

    public Milk(Coffee coffee){
        baseCoffee = coffee;
    }
    @Override
    public int getCost() {
        return baseCoffee.getCost() + 30;
    }
    
}
