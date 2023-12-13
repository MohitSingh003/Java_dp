public class App {
    public static void main(String[] args) throws Exception {
        
        Leaf l1 = new Leaf(10, "name_1");
        Leaf l2 = new Leaf(11, "name_2");

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 =  new Composite();

        Leaf l3 = new Leaf(12, "Name_3");

        composite1.addComposite(composite2);
        composite1.addComposite(composite3);

        composite3.addComposite(l1);
        composite3.addComposite(l3);

        composite1.display();
    }
}
