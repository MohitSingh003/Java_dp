public class Cream extends CoffeeDecorator {

    Coffee baseCoffee;

    public Cream(Coffee coffee){
        baseCoffee = coffee;
    }
    @Override
    public int getCost() {
        return this.baseCoffee.getCost() + 20;
    }

    
    
}
