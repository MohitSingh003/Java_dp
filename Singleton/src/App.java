public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Creating singleton Instance");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
