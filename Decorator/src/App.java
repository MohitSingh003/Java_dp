public class App {
    public static void main(String[] args) throws Exception {
        
        Coffee c1 = new BlackCoffee();

        c1 = new Cream(c1);
        System.out.println("Price of " + c1.getClass().getName() + " is " + c1.getCost());

        Coffee c2 = new Espresso();

        System.out.println("Price of espresso is " + c2.getCost());

        c2 = new Milk(c2);

        System.out.println("Price of espresso with milk is " + c2.getCost());

    }
}
