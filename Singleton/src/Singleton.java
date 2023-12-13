public class Singleton {
    private static Singleton Instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Instance == null) {
            Instance = new Singleton();
            System.out.println("New Singleton Instance Created");
            return Instance;
        } else {
            System.out.println("Singleton Instance already created");
            return Instance;

        }
    }
}
